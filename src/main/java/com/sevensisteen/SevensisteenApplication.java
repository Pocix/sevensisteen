package com.sevensisteen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@MapperScan(basePackages = "com.sevensisteen.dao")
@PropertySource("classpath:db.properties")
@SpringBootApplication
public class SevensisteenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SevensisteenApplication.class, args);
	}
}
