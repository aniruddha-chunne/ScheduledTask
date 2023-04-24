package com.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulerTaskApplication {




	public static void main(String[] args)
	{

		SpringApplication.run(SchedulerTaskApplication.class, args);
		System.out.println("Schedule Task");




	}

}
