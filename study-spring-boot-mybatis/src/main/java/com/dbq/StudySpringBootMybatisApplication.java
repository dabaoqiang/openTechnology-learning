package com.dbq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dabaoqiang
 */
@MapperScan("com.dbq.mybatis")
@SpringBootApplication
public class StudySpringBootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringBootMybatisApplication.class, args);
	}

}
