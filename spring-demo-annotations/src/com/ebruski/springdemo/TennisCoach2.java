package com.ebruski.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach2 implements Coach {

    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach2() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // define a setter method
    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune() + " 2";
    }
}
