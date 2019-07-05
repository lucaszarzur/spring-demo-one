package com.lucas.springdemo;

import com.lucas.springdemo.interfaces.Coach;
import com.lucas.springdemo.service.FortuneService;

public class TrackCoach implements Coach {

    // define a private field for the dependecy
    private FortuneService fortuneService;

    public TrackCoach(){

    }

    //define a constructor for dependecy injection
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }
}