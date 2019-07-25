package com.business.controller.work;

import com.business.aspect.HttpLog;
import com.business.entity.ControllerRsp;
import com.business.entity.TCompanyUser;
import com.business.entity.TJournal;
import com.business.service.JournalService;
import com.business.util.*;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 17:182018-10-19
 * @Modified By:
 */
@RestController
@RequestMapping(value = "journal")
public class JournalController {
    private  static final Logger logger= LoggerFactory.getLogger(JournalController.class);
    @Autowired
    private JournalService journalService;
    public void base(String page, String limit)
    {
        logger.info("page:"+page);
        logger.info("limit:"+limit);
    }

    /**
     * 查询操作日志信息
     * @return
     */
    @PostMapping(value = "/getJournal")
    @HttpLog(operationType = "0",modularTypeName = "查询操作日志信息")
    public ControllerRsp getJournal (Integer companyUserId,Integer operatingType,String beginTime,String endTime,Integer page, Integer limit,HttpServletRequest request)  {

        TCompanyUser user= SessionUtil.getUser();
     /*   tJournal.setCompanyId(user.getCompanyId());*/
        TJournal tJournal=new TJournal();
        tJournal.setParkid(SessionUtil.getParkId());
        tJournal.setCompanyUserId(companyUserId);
        tJournal.setOperatingType(operatingType);
        return ControllerRspUtil.Success(journalService.getTJournalByPage(tJournal,beginTime,endTime,page,limit));
    }
}
