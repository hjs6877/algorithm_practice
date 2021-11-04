package com.itvillage.algorithm_site.testdome;

public class RainStorm extends Storm{
    protected double eyeRadius;
    protected double eyePositionX;
    protected double eyePositionY;

    public RainStorm(double eyeRadius, double eyePositionX, double eyePositionY) {
        super(eyeRadius, eyePositionX, eyePositionY);
        this.eyeRadius = eyeRadius;
        this.eyePositionX = eyePositionX;
        this.eyePositionY = eyePositionY;
    }

    public double amountOfRain() {
        return eyeRadius * 20;
    }
}
