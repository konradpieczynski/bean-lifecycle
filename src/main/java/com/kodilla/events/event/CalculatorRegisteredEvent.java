package com.kodilla.events.event;

import org.springframework.context.ApplicationEvent;

public class CalculatorRegisteredEvent extends ApplicationEvent {
    double a;
    double b;
    double result;

    public CalculatorRegisteredEvent(Object source, double a, double b, double result) {
        super(source);
        this.a = a;
        this.b = b;
        this.result = result;
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
}
