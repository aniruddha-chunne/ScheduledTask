package com.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class SchedulerAndTimeTaskApplication
{

    //fixed delay
    //fixed rate
    // initial delay
    //cron



    @Scheduled(fixedDelay = 1000, initialDelay = 1000)
    public void scheduleFixedDelayTask()
    {
        System.out.println("Scheduled Job running at every 1 Second" + Calendar.getInstance().getTime());
    }

}
