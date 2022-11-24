package com.ebruski.springdemo;

public class MyApp {
    public static void main(String[] args) {
        //creat the object
        Coach theCoach = new TrackCoach();

        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
