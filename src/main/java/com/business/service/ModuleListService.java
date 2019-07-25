package com.business.service;

import com.business.entity.LayuiMenu;
import com.business.entity.TModuleList;
import com.business.entity.TModuleListNew;
import com.business.entity.ZtreeRsp;

import java.util.List;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 18:282018-9-14
 * @Modified By:
 */
public interface ModuleListService {
    List<TModuleListNew> getModuleList(TModuleListNew tModuleListNew);
    List<ZtreeRsp> getModuleListForZtree(TModuleListNew tModuleListNew);
    List<LayuiMenu> getModuleListNewForLayuiMenu(List<Integer> tModuleListNew);
}
