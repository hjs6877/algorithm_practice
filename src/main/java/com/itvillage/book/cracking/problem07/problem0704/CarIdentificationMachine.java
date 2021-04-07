package com.itvillage.book.cracking.problem07.problem0704;

import java.util.HashMap;
import java.util.Map;

public class CarIdentificationMachine {
    private Map<String, CarInfo> carInfoMap = new HashMap<>();
    public CarIdentificationMachine() {

    }


    public void removeCarInfo(String carNumber) {
        this.carInfoMap.remove(carNumber);
    }

    public void addCarInfo(CarInfo carInfo) {
        carInfoMap.put(carInfo.getCarNumber(), carInfo);
    }

    public CarInfo getCarInfo(String carNumber) {
        return carInfoMap.get(carNumber);
    }
}
