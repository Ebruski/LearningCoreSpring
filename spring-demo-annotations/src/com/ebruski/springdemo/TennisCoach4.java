package com.ebruski.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach4 implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach4() {
        System.out.println(">> TennisCoach: inside default constructor4");
    }

    // define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">> TennisCoach4: inside of doMyStartupStuff");
    }

    // define my init method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">> TennisCoach4: inside of doMyCleanupStuff");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune() + " 4" ;
    }
}
