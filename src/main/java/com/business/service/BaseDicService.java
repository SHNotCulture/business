package com.business.service;

import com.business.entity.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface BaseDicService {
    List<TParkPort> selectParkPort(String portType);
    List<TDicOuttype> selectOutType();
    List<TDicPrepayType> selectgetPayType();
    List<ZtreeRsp> getPortNameListForZtree(String portType);

}
