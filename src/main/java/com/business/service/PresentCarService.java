package com.business.service;

import com.business.entity.TParkInOut;
import com.business.util.PageBean;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface PresentCarService {
    Integer FindTemporaryCar();
    Integer FindMonthlyCar();
    Integer FindPrivateCar();
    Integer FindTotalParkingSpace();
    PageBean<TParkInOut> FindPresentCarbyPage(TParkInOut tParkInOut, String parkId, String timeType, Integer page, Integer limit);
    List<TParkInOut> FindPresentCar(TParkInOut tParkInOut, String timeType, String parkId);
    void exportList(TParkInOut tParkInOut, String timeType, String title, String parkId, HttpServletResponse response);
    String selectPresentCarByCarplate(Integer parkId, String carplate);
    List<String> selectPresentCarLikeCarplate(Integer parkId, String carPlate);
}
