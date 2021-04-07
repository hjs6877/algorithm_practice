package com.itvillage.book.cracking.problem07.problem0704;

import java.util.HashMap;
import java.util.Map;

public class PaymentMachine {
    private Map<String, CarInfo> carInfoMap = new HashMap<>();

    public void addCarInfo(CarInfo carInfo) {
        this.carInfoMap.put(carInfo.getCarNumber(), carInfo);
    }

    public void removeCarInfo(String carNumber) {
        this.carInfoMap.remove(carNumber);
    }
}
