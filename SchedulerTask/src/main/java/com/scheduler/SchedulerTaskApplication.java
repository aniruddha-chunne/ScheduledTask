package com.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchedulerTaskApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SchedulerTaskApplication.class, args);
		System.out.println("Schedule Task");
	}

}
