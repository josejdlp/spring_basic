package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    /*
    @Autowired
    @Qualifier("fortuneService2")
    */
    private FortuneService fortuneService;


    public TennisCoach() {
        System.out.println("Default construtor TennisCoach!");
    }


    /*
     @Autowired
    public TennisCoach( @Qualifier("fortuneService2") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
*/

    @Autowired
    public void setFortuneService(@Qualifier("fortuneService2") FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside setFortuneService");
        this.fortuneService=fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
