package com.macymoo.monitor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class MonitorApplication {

	@Value("{app.name}")
	String appName;

	public static void main(String[] args) {
		SpringApplication.run(MonitorApplication.class, args);
	}

	public MonitorApplication(){
		System.out.println("MonitorApplication.MonitorApplication");
		System.out.println("appName = " + appName);
	}
}
