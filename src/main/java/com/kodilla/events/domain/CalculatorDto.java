package com.kodilla.events.domain;

public class CalculatorDto {
    private double a;
    private double b;
    private double result;

    public CalculatorDto(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
