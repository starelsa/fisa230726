package com.fisa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//연관없는 package 내부에 존재하는 스프링 빈 package 등록
//ComponentScan({})
@SpringBootApplication
public class Step02GBookApplication {
	public static void main(String[] args) {
		SpringApplication.run(Step02GBookApplication.class, args);
	}
}