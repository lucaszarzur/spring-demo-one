package com.lucas.springdemo;

import com.lucas.springdemo.interfaces.Coach;
import com.lucas.springdemo.service.FortuneService;

public class BaseballCoach implements Coach {

    // define a private field for the dependecy
    private FortuneService fortuneService;

    //define a constructor for dependecy injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {

        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}