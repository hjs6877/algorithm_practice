package com.itvillage.book.cracking.problem07.problem0704;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class PaymentMachine {
    private CarIdentificationMachine carIdentificationMachine;
    private CardCompany cardCompany;

    public PaymentMachine(CarIdentificationMachine carIdentificationMachine, CardCompany cardCompany) {
        this.carIdentificationMachine = carIdentificationMachine;
        this.cardCompany = cardCompany;
    }

    public int calculateFee(String carNumber) {
        CarInfo carInfo = carIdentificationMachine.getCarInfo(carNumber);
        LocalDateTime entranceTime = carInfo.getEntranceTime();
        LocalDateTime exitTime = carInfo.getExitTime();
        int total = 0;

        // TODO 비용 계산
        return total;
    }

    public String payFee(CardInfo cardInfo, int fee) {
        // TODO 카드사에게 지불 정보 전송
        String result = "";
        return result;
    }
}
