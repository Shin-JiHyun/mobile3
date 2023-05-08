package com.example.mobile3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//뒤에exclude는 아직db설정x상태
public class Mobile3Application {

	public static void main(String[] args) {
		SpringApplication.run(Mobile3Application.class, args);
	}

}
