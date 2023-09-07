package com.kodilla.events.service;

import com.kodilla.events.event.CalculatorRegisteredEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CalculatorManager implements ApplicationListener<CalculatorRegisteredEvent> {

    @Override
    public void onApplicationEvent(CalculatorRegisteredEvent event) {
        System.out.println("A is " + event.getA());
        System.out.println("B is: " + event.getB());
        System.out.println("Result is: " + event.getResult());
    }
}
