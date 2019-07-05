package com.lucas.springdemo;

import com.lucas.springdemo.interfaces.Coach;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}