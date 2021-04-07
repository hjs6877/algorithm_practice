package com.itvillage.book.cracking.problem07.problem0704;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpace {
    private Map<ParkingSpaceType, Integer> parkingSpaceMap = new HashMap<>();

    public void addParkingSpace(ParkingSpaceType parkingSpaceType) {
        // TODO
    }

    public void removeParkingSpace(ParkingSpaceType parkingSpaceType) {
        // TODO
    }

    public Map<ParkingSpaceType, Integer> getParkingSpaceNow() {
        return parkingSpaceMap;
    }

    public enum ParkingSpaceType {
        ONLY_WOMAN,
        ONLY_LAMB,
        GENERAL
    }

}
