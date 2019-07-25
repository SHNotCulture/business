package com.business.controller.work;


import com.business.aspect.HttpLog;
import com.business.entity.*;
import com.business.service.ModuleListService;
import com.business.util.ControllerRspUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 16:082018-8-20
 * @Modified By:
 */
@RestController
@RequestMapping(value = "moduleList")
public class ModuleListController {
    private  static final Logger logger= LoggerFactory.getLogger(ModuleListController.class);

    @Autowired
    private ModuleListService moduleListService;

    /**
     * 查询全部页面信息Ztree
     * @return
     */
    @PostMapping(value = "/getModuleListForZtree")
    @HttpLog(operationType = "0",modularTypeName = "查询全部页面信息Ztree")
    public ControllerRsp getModuleListForZtree(TModuleListNew tModuleList) throws Exception {
        return ControllerRspUtil.Success(moduleListService.getModuleListForZtree(tModuleList));
    }

}
