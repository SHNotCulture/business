<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>电子券查询</title>
    <link rel="stylesheet" href="../js/layui/css/layui.css" media="all"/>
    <script src="../js/layui/layui.js"></script>
    <script src="../js/jQuery1.9.1/jquery-1.9.1.js"></script>
    <style type="text/css">
      /*  #carNum{
            height:80px;
            border-radius: 5px;
    }*/
        ul{
            display: flex;
            justify-content:space-around;
            overflow: hidden;
        }
    ul li{
        margin-top:8px;
    }
    /*ul li .carStyle{
        width:180px;
        height:65px;
        border-radius: 5px;
    }
    .carL{
        text-align: center;
        width:45px;
        height:80px;
        display:inline-block;
    }*/
    .carL span{
        display: block;
        margin:4px 0 0 10px;
        width:16px;
        word-wrap: break-word;
        font-size:5px;
        font-weight: bold;
        color:white;
    }
   /* .cNum{
        font-size:30px;
        font-weight: bold;
        text-align: center;
        margin-left:40px;
    }
    .Btn{
        display: flex;
        justify-content:space-around;
        overflow: hidden;
    }*/
    .Btn button{
        width:100px;
        height:30px;
        margin:10px 15px 10px 15px;
        text-align: center;
        color:white;
        font-weight: bold;
        font-size:18px;
        border-radius: 3px;
        border:none;
        cursor: pointer;
    }

    </style>
    <script type="text/javascript">
        var tableIns;
        layui.use(['table','form','layer','laydate'], function(){
            var table = layui.table;
            var form=layui.form;
            var layer=layui.layer;
            var laydate = layui.laydate;

            //第一个实例
            tableIns=table.render({
                elem: '#busineTicketTable'
                ,height: 400
                ,url: '../electronicBusineTicket/getBusineTicketList' //数据接口  ElectronicCouponRecordsController 查询电子优惠券记录
                ,method:'post'
                // ,toolbar: true
                ,defaultToolbar: ['filter', 'print']
                ,loading:true
                ,page: true //开启分页
                ,title:'电子券记录查询'
                ,cols: [[ //表头
                    {type: 'numbers', title: '序号', width:80, fixed: 'left'}
                    ,{field: 'ticketName', title: '电子券名称', width:170, align:'center'}
                    ,{field: 'limitDay', title: '每日限额', width: 140, align:'center', sort: true}
                    ,{field: 'limitMonth', title: '每月限额', width: 140, align:'center', sort: true}
                    ,{field: 'limitYear', title: '每年限额', width:140, align:'center', sort: true}
                    ,{field: 'ticketInitialNum', title: '购买数量', width:170, align:'center'}
                    ,{field: 'ticketNum', title: '剩余数量', width:170, align:'center', sort: true}
                    ,{field: 'expiryDate', title: '到期时间', width:170, align:'center', sort: true}
                    ,{fixed: 'right',title: '操作', width: 200, toolbar: '#busineTicketBar'}
                ]]
            });

            //监听工具条
            table.on('tool(busineTicketTable)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
                var data = obj.data; //获得当前行数据
                var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
                //var tr = obj.tr; //获得当前行 tr 的DOM对象

                if(layEvent === 'buyback'){ //回购
                    //console.log("当前行数据",data);
                    if (data.ticketNum>0){
                        form.val("buyBackComf", data);
                        layer.open({
                            title: '回购数量确认'
                            ,type: 1
                            ,area:['350px','200px']
                            ,content: $('#buyBackComf')
                        });
                    }else {
                        layer.msg("已用完，不能回购");
                    }
                }
            });

            //监听查询按钮
            form.on('submit(selectBusineTicket)', function(data){
                //console.log(data.elem) //被执行事件的元素DOM对象，一般为button对象
                //console.log(data.form) //被执行提交的form对象，一般在存在form标签时才会返回
                //console.log(data.field) //当前容器的全部表单字段，名值对形式：{name: value}
                BusineTicketHandle.SelectBusineTicket(data.field);
                return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。

            });
            //监听查询按钮
            form.on('submit(buyBack)', function(data){
                //console.log(data.elem) //被执行事件的元素DOM对象，一般为button对象
                //console.log(data.form) //被执行提交的form对象，一般在存在form标签时才会返回
                //console.log(data.field) //当前容器的全部表单字段，名值对形式：{name: value}
                BusineTicketHandle.BuyBackTicket(data.field);
                return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。

            });

            form.render(); //更新全部
        });

        var BusineTicketHandle= {
            SelectBusineTicket: function (obj) {
                //这里以搜索为例
                tableIns.reload({
                    where:
                    obj,
                    page: {
                        curr: 1 //重新从第 1 页开始
                    }
                });
            },
            BuyBackTicket: function (data) {
                if (parseInt(data.ticketNum)>=parseInt(data.buyBackNum)){
                    data.ticketNum = (parseInt(data.ticketNum) - parseInt(data.buyBackNum)).toString();
                    $.ajax({
                        type: 'POST',
                        url: "../electronicBusineTicket/buyBackBusineTicket",
                        data:data,
                        dataType: "json",
                        contentType: "application/x-www-form-urlencoded; charset=utf-8",
                        success: function (result) {
                            //console.log(object);
                            if(result.code==0)
                            {
                                if (result.result=='电子券使用记录更新成功') {
                                    layer.closeAll();
                                    layer.msg(result.result, {icon: 6});
                                    tableIns.reload();
                                }
                            }
                        },
                        error:function (result) {
                            console.log(result);
                        }
                    })
                }else{
                    layer.msg("回购数量不能大于剩余数量");
                }

            }
        }
    </script>

    <script type="text/html" id="busineTicketBar">
        <a class="layui-btn layui-btn-xs" lay-event="buyback">回购</a>
        <a class="layui-btn layui-btn-xs" lay-event="buy">购买</a>
    </script>

<#--    电子优惠券优惠类型(0/金额 1/时间)-->
    <script type="text/html" id="couponTypeTemp">
        {{# if(d.couponType===0){ }}
        {{ '金额' }}
        {{# }if(d.couponType===1){ }}
        {{ '时间' }}
        {{# } }}
    </script>



    <script type="text/html" id="TicketCouponRecords">
        <div class="layui-btn-container">
            <button class="layui-btn layui-btn-sm" lay-event="TicketCouponRecordsExcel">导出电子券使用记录</button>
        </div>
    </script>
</head>
<body>
<blockquote class="layui-elem-quote">电子券购买记录查询</blockquote>

<form class="layui-form" style="margin: 10px" id="TicketCouponRecordsForm" lay-filter="TicketCouponRecordsForm">

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">电子券名称</label>
            <div class="layui-input-inline" style="width: 200px;">
                <input type="text" name="ticketName" autocomplete="off" placeholder="可模糊查询" class="layui-input">
            </div>
            <div class="layui-input-inline" style="width: 200px;">
                <button class="layui-btn"  lay-submit lay-filter="selectBusineTicket" id="selectBusineTicket">查询</button>
            </div>
        </div>
    </div>
</form>
<table id="busineTicketTable" lay-filter="busineTicketTable"></table>

<form class="layui-form" id="buyBackComf" lay-filter="buyBackComf" style="display: none">
    <div class="layui-form-item">
        <label class="layui-form-label">剩余数量</label>
        <div class="layui-input-block">
                <input type="text" id="ticketNum" name="ticketNum" autocomplete="off" class="layui-input" disabled>
        </div>
    </div>
    <div class="layui-form-item">
            <label class="layui-form-label" >回购数量</label>
            <div class="layui-input-block">
            <input type="text" id="buyBackNum" name="buyBackNum" autocomplete="off" class="layui-input">
            </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
        <button class="layui-btn"  lay-submit lay-filter="buyBack" id="buyBack"  >确认</button>
        </div>
    </div>
</form>

</body>
</html>