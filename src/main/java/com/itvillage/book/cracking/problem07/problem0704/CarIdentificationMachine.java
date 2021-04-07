package com.itvillage.book.cracking.problem07.problem0704;

import java.util.HashMap;
import java.util.Map;

public class CarIdentificationMachine {
    private PaymentMachine paymentMachine;

    public CarIdentificationMachine(PaymentMachine paymentMachine) {
        this.paymentMachine = paymentMachine;
    }

    public void identifyCar(CarInfo carInfo) {
        paymentMachine.addCarInfo(carInfo);
    }
}
