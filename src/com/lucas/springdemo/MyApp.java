package com.lucas.springdemo;

import com.lucas.springdemo.interfaces.Coach;

public class MyApp {

    public static void main(String[] args) {

        //problem here -> this code is still hardcoded :(

        //create the object
        Coach theCoach = new BaseballCoach();

        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}