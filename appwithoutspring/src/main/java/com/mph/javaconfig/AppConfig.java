package com.mph.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean(name="gs1")
	@Scope(value="prototype")
	public GreetingServiceImp1 getGs1() {
		GreetingServiceImp1 gs=new GreetingServiceImp1();
		gs.setGreetMsg("Have a great day...");
		return gs;
	}
	@Bean(name="gs2")
	public GreetingServiceImp1 getGs2() {
		GreetingServiceImp1 gs=new GreetingServiceImp1("Have a tramendous tuesday....");
		return gs;
	}
}
