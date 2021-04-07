package com.itvillage.book.cracking.problem07.problem0704;

public class IdentifyCamera {
    private CarIdentificationMachine carIdentificationMachine;

    public IdentifyCamera(CarIdentificationMachine carIdentificationMachine) {
        this.carIdentificationMachine = carIdentificationMachine;
    }

    public void identifyCar(CarInfo carInfo) {
        carIdentificationMachine.addCarInfo(carInfo);
    }

}
