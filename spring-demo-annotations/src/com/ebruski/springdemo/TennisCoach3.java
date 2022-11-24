package com.ebruski.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach3 implements Coach {


    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach3() {
        System.out.println(">> TennisCoach: inside default constructor3");
    }

    // define a method injection
    @Autowired
    @Qualifier("happyFortuneService")
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune() + " 3";
    }
}
