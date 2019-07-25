package com.business.service;

import com.business.entity.TBusineTicket;
import com.business.util.PageBean;

import java.util.List;

public interface ElectronicTbusineTicketService {
    PageBean<TBusineTicket> getTBusineTicketByPage(TBusineTicket tBusineTicket, Integer page, Integer limit);
    /*查询商户拥有可用的电子券种类*/
    List<Integer> getIdsByUsable(TBusineTicket tBusineTicket);
    /*根据电子券id查询最接近过期的电子券批次号*/
    Integer getTBusineTicketExpireSoon(Integer busineId, Integer ticketId);
    /*购买电子券*/
    String eleBuy(TBusineTicket tBusineTicket);
    /*回购电子券*/
    String buyBackBusineTicket(TBusineTicket tBusineTicket);
}