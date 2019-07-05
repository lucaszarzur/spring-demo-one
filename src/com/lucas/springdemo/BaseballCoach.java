package com.lucas.springdemo;

import com.lucas.springdemo.interfaces.Coach;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}