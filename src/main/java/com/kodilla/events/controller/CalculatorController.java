package com.kodilla.events.controller;

import com.kodilla.events.domain.CalculatorDto;
import com.kodilla.events.event.CalculatorRegisteredEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/calculator")
public class CalculatorController implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    @PostMapping(path = "add")
    public void calcAdd(@RequestBody CalculatorDto calculatorDto) {
        calculatorDto.setResult(calculatorDto.getA() + calculatorDto.getB());
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        calculatorDto.getA(),
                        calculatorDto.getB(),
                        calculatorDto.getResult()));
    }
    @PostMapping(path = "subtract")
    public void calcSub(@RequestBody CalculatorDto calculatorDto) {
        calculatorDto.setResult(calculatorDto.getA() - calculatorDto.getB());
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        calculatorDto.getA(),
                        calculatorDto.getB(),
                        calculatorDto.getResult()));
    }

    @PostMapping(path = "multiply")
    public void calcMul(@RequestBody CalculatorDto calculatorDto) {
        calculatorDto.setResult(calculatorDto.getA() * calculatorDto.getB());
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        calculatorDto.getA(),
                        calculatorDto.getB(),
                        calculatorDto.getResult()));
    }
    @PostMapping(path = "divide")
    public void calcDiv(@RequestBody CalculatorDto calculatorDto) {
        calculatorDto.setResult(calculatorDto.getA() * calculatorDto.getB());
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        calculatorDto.getA(),
                        calculatorDto.getB(),
                        calculatorDto.getResult()));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
