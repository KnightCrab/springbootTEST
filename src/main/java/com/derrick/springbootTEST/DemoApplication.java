package com.derrick.springbootTEST;

import com.derrick.springbootTEST.filter.CorsFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@MapperScan("com.derrick.springbootTEST.dao")//将项目中对应的mapper类的路径加进来就可以了

@SpringBootApplication
@ServletComponentScan


public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean testFilterRegistration() {

		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new CorsFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("corsFilter");
		registration.setOrder(1);
		return registration;
	}

}



