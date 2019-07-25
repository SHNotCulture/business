package com.business.service;

import com.business.entity.TElectronicTicket;
import com.business.util.PageBean;

import java.util.List;

public interface ElectronicTicketService {
    PageBean<TElectronicTicket> geteTicketListbyPage(TElectronicTicket tElectronicTicket, Integer page, Integer limit);
    String updateEticket(TElectronicTicket tElectronicTicket);
    String deleteEticket(TElectronicTicket tElectronicTicket);
    TElectronicTicket getElectronicTicketByPrimaryKey(Integer id);
    PageBean<TElectronicTicket> geteTicketListbyPageAndIds(List<Integer> ids, Integer page, Integer limit);

}