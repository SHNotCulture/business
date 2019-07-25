package com.business.service;

import com.business.entity.TElectronicTicket;
import com.business.entity.TTicketCoupon;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ElectronicCouponRecordsService {
    List<TTicketCoupon> getTElectronicTicket(TTicketCoupon tTicketCoupon, String InTimeBegin, String InTimeEnd, String OutTimeBegin, String OutTimeEnd);
}
