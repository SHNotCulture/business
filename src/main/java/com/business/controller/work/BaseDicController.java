package com.business.controller.work;

import com.business.aspect.HttpLog;
import com.business.entity.*;
import com.business.service.BaseDicService;
import com.business.util.ActionRspUtil;
import com.business.util.ControllerRspUtil;
import com.business.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BaseDicController
 * @Author jin
 * @Date 2018/9/27 15:40
 **/
@RestController
@RequestMapping(value = "BaseDic")
public class BaseDicController {
    private  static final Logger logger= LoggerFactory.getLogger(BaseDicController.class);
    @Autowired
    private BaseDicService baseDicService;

    /**
     * 查询该停车场的通道名称
     * @return
     */
    @PostMapping(value = "/getPortName")
    @HttpLog(operationType = "0",modularTypeName = "查询停车场的通道名称")
    public ControllerRsp getPortName(HttpServletRequest request){
        return ControllerRspUtil.Success(baseDicService.selectParkPort(request.getParameter("portType")));
    }
    @PostMapping(value = "/getOutType")
    @HttpLog(operationType = "0",modularTypeName = "查询出场方式")
    public ControllerRsp getOutType(){
        return ControllerRspUtil.Success(baseDicService.selectOutType());
    }
    @PostMapping(value = "/getPayType")
    @HttpLog(operationType = "0",modularTypeName = "查询支付方式")
    public ControllerRsp getPayType(){
        return ControllerRspUtil.Success(baseDicService.selectgetPayType());
    }

    @PostMapping(value = "/getPortNamejson")
    @HttpLog(operationType = "0",modularTypeName = "查询停车场的通道名称")
    public ActionRsp getPortNamejson(HttpServletRequest request){
        List<TParkPort> tParkPortList = baseDicService.selectParkPort(request.getParameter("portType"));
        List<TreeParkPort> treeParkPorts=new ArrayList<>();
        for (int i=0;i<tParkPortList.size();i++){
            TreeParkPort treeParkPort = new TreeParkPort();
            treeParkPort.setId(tParkPortList.get(i).getPortId());
            treeParkPort.setName(tParkPortList.get(i).getPortName());
            treeParkPorts.add(treeParkPort);
        }
        System.out.println("json:"+JsonUtil.beanToJson(treeParkPorts));
        return ActionRspUtil.Success(JsonUtil.beanToJson(treeParkPorts));
    }

    /**
     * 查询全部页面信息Ztree
     * @return
     */
    @PostMapping(value = "/getPortNameListForZtree")
    @HttpLog(operationType = "0",modularTypeName = "查询全部页面信息Ztree")
    public ControllerRsp getPortNameListForZtree(HttpServletRequest request) throws Exception {
        return ControllerRspUtil.Success(baseDicService.getPortNameListForZtree(request.getParameter("portType")));
    }
}
