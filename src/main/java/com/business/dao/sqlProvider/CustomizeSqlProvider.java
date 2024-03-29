package com.business.dao.sqlProvider;

import com.business.entity.*;
import com.business.util.*;

import java.util.Date;
import java.util.List;

/**
 * @ClassName CustomizeSqlProvider
 * @Author jin
 * @Date 2018/9/28 18:52
 **/
public class CustomizeSqlProvider {

    public String selectMonthlyNum(String parkId){
        String sql = "select a.totalCarNo,a.parkingNo,b.*,c.*,d.* from \n" +
                "(select IFNULL(SUM(length(car_plate) + 1 - length(REPLACE (car_plate, ',', ''))),0) totalCarNo,IFNULL(SUM(parking_no),0) parkingNo from t_park_car where park_id="+parkId+") a, \n" +
                "(SELECT IFNULL(SUM(parking_no),0) privateParkingNo from t_park_car where is_owner=1 and park_id="+parkId+") b,\n" +
                "(select IFNULL(SUM(parking_no),0) pauseParkingNo from t_park_car WHERE status=2 and park_id="+parkId+")c,\n" +
                "(select IFNULL(SUM(parking_no),0) expiredParkingNo from t_park_car WHERE status=3 and park_id="+parkId+")d";
        return sql.toString();
    }

    public String selectMainNum(String parkId){
        String sql = "select a.monEle,b.monCash,c.temporaryEle,d.temporaryCash,e.yueEle,f.yueCash from\n" +
                "(SELECT IFNULL(SUM(actual_pay),0) monEle FROM t_park_in_out_"+parkId+" where car_nature=2 and charge_type=1 and to_days(out_time) = to_days(now()))a,\n" +
                "(SELECT IFNULL(SUM(actual_pay),0) monCash FROM t_park_in_out_"+parkId+" where car_nature=2 and charge_type=3 and to_days(out_time) = to_days(now()))b,\n" +
                "(SELECT IFNULL(SUM(actual_pay),0) temporaryEle FROM t_park_in_out_"+parkId+" where car_nature=3 and charge_type=1 and to_days(out_time) = to_days(now()))c,\n" +
                "(SELECT IFNULL(SUM(actual_pay),0) temporaryCash FROM t_park_in_out_"+parkId+" where car_nature=3 and charge_type=3 and to_days(out_time) = to_days(now()))d,\n" +
                "(SELECT IFNULL(SUM(actual_pay),0) yueEle FROM t_park_in_out_"+parkId+" where charge_type=1 and DATE_FORMAT(out_time, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ))e,\n" +
                "(SELECT IFNULL(SUM(actual_pay),0) yueCash FROM t_park_in_out_"+parkId+" where charge_type=3 and DATE_FORMAT(out_time, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ))f";
        return sql.toString();
    }

    /**
     * 电子报表
     *
     * @return
     */
        public String paymentForDay(){
            StringBuilder sql=new StringBuilder();
            sql.append("insert into t_electron_Payment \n" +
                    " (park_id,create_date,temp_online_total,\n" +
                            "fix_online_actual_total,temp_qPassPay_Total,temp_PrePay_Total,weChat_PrePay_Total,\n" +
                            "alipay_PrePay_Total,third_PrePay_Total,\n" +
                            "monthly_weChat_Total,temp_unionPay_Total,temp_card_Total,\n" +
                            "temp_rights_Total,temp_weChat_Total,temp_alipay_Total)\n" +
                            "select park_id,create_date,temp_online_total,\n" +
                            "fix_online_actual_total,temp_qPassPay_Total,temp_PrePay_Total,weChat_PrePay_Total,\n" +
                            "alipay_PrePay_Total,third_PrePay_Total,\n" +
                            "monthly_weChat_Total,temp_unionPay_Total,temp_card_Total,\n" +
                            "temp_rights_Total,temp_weChat_Total,temp_alipay_Total\n" +
                            "FROM t_park_report where create_date=left(DATE_SUB(curdate(),INTERVAL 1 DAY),10)");
            return sql.toString();
        }
        public String parkTiggerForInOut(String parkId)
        {
            StringBuilder sql=new StringBuilder();
            sql.append("CREATE TABLE t_park_in_out_" +parkId+ " SELECT * FROM t_park_in_out WHERE 1=2;");
            return sql.toString();
        }
        public String parkTiggerForTask(String parkId)
        {
            StringBuilder sql=new StringBuilder();
            sql.append("CREATE TABLE t_task_" +parkId+ " SELECT * FROM t_task WHERE 1=2");
            return sql.toString();
        }
    public String selectHistogram(String parkId,String year,String type){
        String sql= "select month(out_time) as month,sum("+type+")nums from t_park_in_out_"+parkId+" where year(out_time) = "+year+" and "+type+">0 group by month (out_time)";
        return sql.toString();
    }

    public String selectCompanyPark(String parkId){
        String sql = "select (total_parking_space-in_fixprivate_cars-in_fixlots_cars-in_tempcars)totalVacancySpace,park_vacancy_space parkVacancySpace,private_vacancy_space privateVacancySpace,(in_fixprivate_cars+in_tempcars+in_fixlots_cars)inTotle,in_fixprivate_cars inFixprivate,in_fixlots_cars inFixlots,in_tempcars inTemp,incar_count_today inCars,outcar_count_today outCars,noconfirmcar_count_today noconfirmCar  from t_company_park where id="+parkId;
        return sql.toString();
    }

    public String updateCompanyPark(String parkId,String column,Integer msg){
        String sql = "update t_company_park set "+column+"="+msg+" where id="+parkId;
        return sql.toString();
    }

    public String insetParktable(Integer parkId, Integer parkCarId, ParkCarTask parkCarTask, String computerIndex){
        String data = JsonUtil.beanToJson(parkCarTask);
        String tabateName = "t_task_"+parkId;
        String sql = "INSERT INTO "+tabateName+" (park_car_id,task_type,data,pk,task_status,create_time)" +
                " value("+parkCarId+",'mcard_update','"+data+"','"+computerIndex+"','0','"+ DateUtils.dateFormat(new Date())+"')";
        return sql.toString();
    }

    public String insertBlackTask(Integer parkId, BlackListTask blackListTask,String pk){
        String data = JsonUtil.beanToJson(blackListTask);
        String tabateName = "t_task_"+parkId;
        String sql = "INSERT INTO "+tabateName+" (task_type,data,pk,task_status,create_time)" +
                " value('black_update','"+data+"','"+pk+"','0','"+ DateUtils.dateFormat(new Date())+"')";
        return sql.toString();
    }

    public String findParkPortInId(String ids){
        String sql = "select * from t_park_port as p where p.id in("+ids+")";
        return sql.toString();
    }

    public String selectCloseParkCar(String closeDays,String payRule,String parkid){
            String sql1="";
            String sql2="";
            if (closeDays.length()>0){
                sql1 = "and DATEDIFF(end_date,begin_date)<="+closeDays+"";
            }if (payRule.length()>0){
                sql2 = "and pay_rule="+payRule+"";
        }
        String sql = "select * from t_park_car where park_id="+parkid+" "+sql1+" "+sql2+"";
        return sql.toString();
    }

    public String Resetport(String portids, String ids){
        String sql = "UPDATE t_park_car SET port_id='"+portids+"' where id in ("+ids+")";
        return sql.toString();
    }

    public String getMaturityNo(String parkid){
        String sql = "SELECT COUNT(*) from t_park_car where end_date<=LAST_DAY(now()) and status=1 and park_id="+parkid+"";
        return sql.toString();
    }

    public String selectParkingRecordNum(String parkid){
        String sql = "select needpay_total_today needPay,cashpay_total_today cashPay,prepay_total_today beforePay,behalfpay_total_today coupon,qpasspay_total_today polymerization,localcouponpay_total_today relief from t_company_park where id="+parkid+"";
        return sql.toString();
    }

    /**
     * 查找今日收入
     * @param parkid
     * @return
     */
    public String selectTodayPay(String parkid){
        String sql="select create_date,temp_NeedPay_Total from t_park_report where to_days(create_date) = to_days(now()) and park_id="+parkid+"";
        return sql.toString();
    }

    /**
     * 查找免单车辆数
     * @param parkid
     * @return
     */
    public String selectFreeTotal (String parkid){
        String sql="select free_total from t_park_report where to_days(create_date) = to_days(now()) and park_id="+parkid+"";
        return sql.toString();
    }

    /**
     * 查找今日车流量
     * @param parkid
     * @return
     */
    public String selectTotalNum (String parkid){
        String sql="SELECT a.a+b.b total FROM\n" +
                "(select COUNT(*)a from t_park_in_out_"+parkid+" where to_days(in_time) = to_days(now()))a,\n" +
                "(select COUNT(*)b from t_park_in_out_"+parkid+" where to_days(out_time) = to_days(now()))b";
        return sql.toString();
    }

    /**
     * 查找今日分类型缴费总和
     * @param parkid
     * @return
     */
    public String selectPayByType (String parkid){
        String sql="select IFNULL(w.temp_NeedPay_Total,0)NeedPay,IFNULL(w.free_total,0)free,IFNULL(w.temp_Pay_diff,0)diff,IFNULL(w.temp_BehalfPay_Total,0)BehalfPay,IFNULL(w.temp_qPassPay_Total,0)qPassPay,IFNULL(w.temp_PrePay_Total,0)PrePay,IFNULL(w.temp_coupon_Total,0)coupon from\n" +
                "(select 0 a)q left JOIN\n" +
                "(select 0 a,temp_NeedPay_Total,free_total,temp_Pay_diff,temp_BehalfPay_Total,temp_qPassPay_Total,temp_PrePay_Total,temp_coupon_Total from t_park_report where to_days(create_date) = to_days(now()) and park_id="+parkid+")w ON q.a=w.a";
        return sql.toString();
    }

    /**
     * 查找近七日的车流量
     * @param parkid
     * @return
     */
    public String selectSevenDays (String parkid){
        String sql="select RIGHT(e.date,4)date,(ifnull(e.innum,0)+ifnull(b.outnum,0))num from \n" +
                "(select * from \n" +
                "(select date_format(d.date,'%Y%m%d')date from (select @num:=@num+1,date_format(adddate(DATE_SUB(CURDATE(), INTERVAL 7 DAY), INTERVAL @num DAY),'%Y-%m-%d') as date\n" +
                "from t_dic_qpasspay_type,(select @num:=0) t where adddate(DATE_SUB(CURDATE(), INTERVAL 7 DAY), INTERVAL @num DAY) < date_format(curdate(),'%Y-%m-%d')\n" +
                "order by date)d)c\n" +
                "LEFT JOIN\n" +
                "(select t.intime,COUNT(*)innum from \n" +
                "(select date_format(in_time,'%Y%m%d')intime,date_format(out_time,'%Y%m%d')outtime from t_park_in_out_"+parkid+" where to_days(in_time) >= to_days(now())-6)t\n" +
                "where t.intime is not null\n" +
                "GROUP BY t.intime)a ON c.date=a.intime)e\n" +
                "LEFT JOIN\n" +
                "(select t.outtime,COUNT(*)outnum from \n" +
                "(select date_format(in_time,'%Y%m%d')intime,date_format(out_time,'%Y%m%d')outtime from t_park_in_out_"+parkid+" where to_days(in_time) >= to_days(now())-6)t\n" +
                "where t.outtime is not null\n" +
                "GROUP BY t.outtime)b on e.date=b.outtime ORDER BY e.date";
        return sql.toString();
    }

    public String selectePayType(String parkid){
        String sql="select a.wechat,b.alipay,c.unionPay,d.actualPay,e.etc,f.coupon from\n" +
                "(select \"q\"q,COUNT(*) wechat from t_park_in_out_"+parkid+" where ePayType=3 and to_days(out_time)= to_days(now()))a left join\n" +
                "(select \"q\"q,COUNT(*) alipay from t_park_in_out_"+parkid+" where ePayType=4 and to_days(out_time)= to_days(now()))b on a.q=b.q left join\n" +
                "(select \"q\"q,COUNT(*) unionPay from t_park_in_out_"+parkid+" where ePayType in (1,2,5,6)  and to_days(out_time)= to_days(now()))c on a.q=c.q left join\n" +
                "(select \"q\"q,COUNT(*) actualPay from t_park_in_out_"+parkid+" where actual_pay>0  and to_days(out_time)= to_days(now()))d on a.q=d.q left join\n" +
                "(select \"q\"q,COUNT(*) etc from t_park_in_out_"+parkid+" where ePayType=7  and to_days(out_time)= to_days(now()))e on a.q=e.q left join\n" +
                "(select \"q\"q,COUNT(*) coupon from t_park_in_out_"+parkid+" where localcoupon>0 and to_days(out_time)= to_days(now()))f on a.q=f.q ";
        return sql.toString();
    }

    public String selectCarNum(String parkid){
        String sql="select total_parking_space total,(total_parking_space-in_fixprivate_cars-in_fixlots_cars-in_tempcars)surplus from t_company_park where id="+parkid+"";
        return sql.toString();
    }

    public String selectMainAllNum(String parkid){
        String sql="\n" +
                "select a.overdueNum,b.todayNum,b.CashPay,b.NeedPay,b.free,b.BehalfPay,b.PrePay,b.coupon,b.qPassPay,b.diff,b.fixNeed,b.fixOline,c.wechat wechatNums,c.alipay alipayNums,c.coupon couponNums,c.unionPay unionPayNums,c.actualPay actualPayNums,c.etc etcNums,d.total,d.surplus,e.turnover from\n" +
                "(select \"q\"q, COUNT(*)overdueNum from t_park_car where park_id="+parkid+" and status=3 )a\n" +
                "left join\n" +
                "(select \"q\"q,(incar_count_today+outcar_count_today)todayNum ,localcouponcar_count_today free,needpay_total_today NeedPay,behalfpay_total_today BehalfPay,cashpay_total_today CashPay\n" +
                ",prepay_total_today PrePay,localcouponpay_total_today coupon,qpasspay_total_today qPassPay,(needpay_total_today-behalfpay_total_today-prepay_total_today-localcouponpay_total_today-qpasspay_total_today-cashpay_total_today)diff,monthly_cashpay_today fixNeed,monthly_qpasspay_today fixOline from t_company_park where id="+parkid+")b\n" +
                "on a.q=b.q left join\n" +
                "(select \"q\"q,a.wechat,b.alipay,c.unionPay,d.actualPay,e.etc,f.coupon from (select \"q\"q,COUNT(*) wechat from t_park_in_out_"+parkid+" where ePayType=3 and to_days(out_time)= to_days(now()))a left join\n" +
                "(select \"q\"q,COUNT(*) alipay from t_park_in_out_"+parkid+" where ePayType=4 and to_days(out_time)= to_days(now()))b on a.q=b.q left join\n" +
                "(select \"q\"q,COUNT(*) unionPay from t_park_in_out_"+parkid+" where ePayType in (1,2,5,6)  and to_days(out_time)= to_days(now()))c on a.q=c.q left join\n" +
                "(select \"q\"q,COUNT(*) actualPay from t_park_in_out_"+parkid+" where actual_pay>0  and to_days(out_time)= to_days(now()))d on a.q=d.q left join\n" +
                "(select \"q\"q,COUNT(*) etc from t_park_in_out_"+parkid+" where ePayType=7  and to_days(out_time)= to_days(now()))e on a.q=e.q left join\n" +
                "(select \"q\"q,COUNT(*) coupon from t_park_in_out_"+parkid+" where localcoupon>0 and to_days(out_time)= to_days(now()))f on a.q=f.q)c\n" +
                "on a.q=c.q left join\n" +
                "(select \"q\"q,total_parking_space total,(total_parking_space-in_fixprivate_cars-in_fixlots_cars-in_tempcars)surplus from t_company_park where id="+parkid+")d\n" +
                "on a.q=d.q left join\n" +
                "(select \"q\"q,ROUND((outcar_count_today-incar_count_today)/total_parking_space,4)turnover from t_company_park where id="+parkid+")e\n" +
                "on a.q=e.q";
        return sql.toString();
    }

    public String getCouponNeedPay(TBusinesCoupon tBusinesCoupon){
        String sql="SELECT COALESCE(SUM(need_pay),0) as sum_need_pay FROM t_busine_pay WHERE company_id ='"+tBusinesCoupon.getCompanyId()+"' AND park_id ='"+tBusinesCoupon.getParkId()+"' AND busine_id ='"+tBusinesCoupon.getBusineId()+"' AND (REMARK IS NULL or remark <> '购买电子券')";
        return sql.toString();
    }
    public String selectDetail(String parkId,String whereType){
        String sql = "select * from t_park_in_out_"+parkId+" where "+whereType+"";
        return  sql.toString();
    }

    public String selectDetailNum(String parkId,String whereType){
        String sql = "select count(*) from t_park_in_out_"+parkId+" where "+whereType+"";
        return  sql.toString();
    }

    public String selectPresentCar(String type,String parkId,String andSql){
        String sql = "select "+type+" from \n" +
                "(select * from t_park_in_out_"+parkId+" where in_time is not null and out_time is NULL and in_car_plate!='未识别')a\n" +
                "left join \n" +
                "(SELECT t.* FROM (select * from t_park_in_out_"+parkId+" order by out_time DESC limit 10000000000) t GROUP BY t.in_car_plate)b\n" +
                "on a.in_car_plate=b.in_car_plate\n" +
                "where (a.in_time>b.out_time or b.out_time is NULL) "+andSql;
        return  sql.toString();
    }

    public String insertExcel(String tableName,String column,String insertSql){
        String sql="INSERT INTO "+tableName+"("+column+") VALUE "+insertSql+"";
        return sql.toString();
    }

    public String selectPresentCarByCarplate(String parkId,String carplate){
        String sql="SELECT * FROM t_park_in_out_"+parkId+"  WHERE (out_type = 0 or out_type = 9 or out_type = 11) \n" +
                "and in_car_plate = '"+carplate+"' and in_time = (SELECT MAX(in_time) FROM t_park_in_out_"+parkId+" WHERE in_car_plate = '"+carplate+"')";
        return  sql.toString();
    }

    public String selectPresentCarLikeCarplate(Integer parkId,String carplate){
        String sql="";
        if(StringUtil3.hasHz(carplate)) {
            sql = "SELECT DISTINCT in_car_plate as in_car_plate FROM t_park_in_out_" + parkId + "  where in_car_plate like '" + carplate + "%' and car_nature <> " + CommonUtil.CAR_NAME_2 + " AND (out_type =0 or out_type = 9  or out_type = 11) limit 10";
        }else {
            sql = "SELECT DISTINCT in_car_plate as in_car_plate FROM t_park_in_out_" + parkId + "  where in_car_plate like '%" + carplate + "%' and car_nature <> " + CommonUtil.CAR_NAME_2 + " AND (out_type =0 or out_type = 9  or out_type = 11) limit 10";
        }
            return  sql.toString();
    }

    public String getTBusineTicketExpireSoon(Integer busineId,Integer ticketId){
        String sql = "select r.id FROM(\n" +
                "SELECT a.*,IFNULL(b.y,0)y,IFNULL(b.m,0)m,IFNULL(b.d,0)d from\n" +
                "(SELECT * from t_busine_ticket where ticket_id="+ticketId+" and busine_id="+busineId+" and ticket_num>0 and expiry_date>NOW()\n" +
                "UNION\n" +
                "SELECT * from t_busine_ticket where ticket_id="+ticketId+" and busine_id="+busineId+" and ticket_num>0 and expiry_date=0)a\n" +
                "LEFT JOIN\n" +
                "(select q.batch_code,q.y,w.m,e.d from\n" +
                "(SELECT batch_code,COUNT(1)y from t_ticket_coupon\n" +
                "where ticket_id="+ticketId+" and busine_id="+busineId+" and DATE_FORMAT(update_time,'%Y')=DATE_FORMAT(NOW(),'%Y')\n" +
                "GROUP BY batch_code)q\n" +
                "LEFT JOIN\n" +
                "(SELECT batch_code,COUNT(1)m from t_ticket_coupon\n" +
                "where ticket_id="+ticketId+" and busine_id="+busineId+" and DATE_FORMAT(update_time,'%m')=DATE_FORMAT(NOW(),'%m')\n" +
                "GROUP BY batch_code)w on q.batch_code=w.batch_code\n" +
                "LEFT JOIN\n" +
                "(SELECT batch_code,COUNT(1)d from t_ticket_coupon\n" +
                "where ticket_id="+ticketId+" and busine_id="+busineId+" and DATE_FORMAT(update_time,'%d')=DATE_FORMAT(NOW(),'%d')\n" +
                "GROUP BY batch_code)e\n" +
                "on  w.batch_code=e.batch_code)b on a.id=b.batch_code)r\n" +
                "where (CASE WHEN limit_day=0 THEN 1=1 ELSE limit_day>d END) and (CASE WHEN limit_month=0 THEN 1=1 ELSE limit_month>m END) and (CASE WHEN limit_year=0 THEN 1=1 ELSE limit_year>y END)\n" +
                "LIMIT 1";
        return sql.toString();
    }


    public String getCouponPayMonth(TBusinesCoupon tBusinesCoupon,Integer year) {
        String sql="SELECT substring(t.create_date, 6, 2) as date,sum(t.coupon_pay) as value FROM t_busines_coupon t where left(t.create_date,4)='"+year+"' and t.company_id="+tBusinesCoupon.getCompanyId()+" and t.park_id="+tBusinesCoupon.getParkId()+" and t.busine_id="+tBusinesCoupon.getBusineId()+" GROUP BY  substring(t.create_date, 6, 2)";
        return sql.toString();
    }

    public String getCouponPayDay(TBusinesCoupon tBusinesCoupon,Integer year,Integer month){
        String sql="SELECT substring(t.create_date, 9, 2) as date,sum(t.coupon_pay) as value FROM t_busines_coupon t where left(t.create_date,7)='"+year+"-"+month+"' and t.company_id="+tBusinesCoupon.getCompanyId()+" and t.park_id="+tBusinesCoupon.getParkId()+" and t.busine_id="+tBusinesCoupon.getBusineId()+" GROUP BY  substring(t.create_date, 9, 2)";
        return sql.toString();
    }

    public String getCouponSumPay(TBusinesCoupon tBusinesCoupon){
        String sql="SELECT (SELECT COALESCE(SUM(a.need_pay),0) as sum_need_pay FROM t_busine_pay a WHERE a.company_id ='"+tBusinesCoupon.getCompanyId()+"' AND a.park_id ='"+tBusinesCoupon.getParkId()+"' AND a.busine_id ='"+tBusinesCoupon.getBusineId()+"' and a.remark='购买电子券')+(SELECT COALESCE(SUM(b.coupon_pay),0) as sum_coupon_pay FROM t_busines_coupon b WHERE b.company_id ='"+tBusinesCoupon.getCompanyId()+"' AND b.park_id ='"+tBusinesCoupon.getParkId()+"' AND b.busine_id ='"+tBusinesCoupon.getBusineId()+"')";
        return sql.toString();
    }

    public String getParkInOutPay7(Integer parkId, String date1, String date2){
        String sql="SELECT * FROM t_company_park where id = "+parkId;
        return sql.toString();
    }
    public String getParkNum(Integer parkId, String date){
        String sql="select count(id) from t_park_car where park_id = "+parkId+" and begin_date = '"+date+"'";
        return sql.toString();
    }
    public String getFreeTotal(Integer parkId, String date1, String date2){
        String sql="select count(id) from t_park_in_out_" + parkId + " where park_id = "+parkId+" and out_time <= '"+date2+"' AND out_time >= '"+date1+"'";
        return sql.toString();
    }
    public String getBusinePay(Integer parkId, String date1, String date2){
        String sql="SELECT SUM(actual_pay) as total_actual_pay FROM t_busine_pay AS p where p.pay_time <= '"+date2+"' AND p.pay_time >= '"+date1+"' GROUP BY p.park_id HAVING p.park_id = "+parkId+"";
        return sql.toString();
    }
    public String deleteReport(Integer parkId, String date){
        String sql="DELETE FROM t_park_report WHERE park_id="+parkId+" and create_date='"+date+"'";
        return sql.toString();
    }
    public String selectReport(Integer parkId, String date){
        String sql="select * FROM t_park_report WHERE park_id="+parkId+" and create_date='"+date+"'";
        return sql.toString();
    }
}
