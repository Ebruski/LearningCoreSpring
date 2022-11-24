package com.ebruski.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {


    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier("randomService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune() + " 1";
    }
}
