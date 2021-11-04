package com.itvillage.algorithm_site.testdome;

public class SnowStorm extends Storm {
    protected double eyeRadius;
    protected double eyePositionX;
    protected double eyePositionY;
    private double amountOfSnow;

    public SnowStorm(double eyeRadius, double eyePositionX, double eyePositionY, double amountOfSnow) {
        super(eyeRadius, eyePositionX, eyePositionY);
        this.eyeRadius = eyeRadius;
        this.eyePositionX = eyePositionX;
        this.eyePositionY = eyePositionY;
        this.amountOfSnow = amountOfSnow;
    }

    public double getAmountOfSnow() {
        return amountOfSnow;
    }
}
