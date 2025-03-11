package com.mph.javaconfig;

public class GreetingServiceImp1 implements GreetingService {

	private String greetMsg;

	public GreetingServiceImp1(String string) {
		this.greetMsg=string;
	}

	public GreetingServiceImp1() {
		
	}

	public String getGreetMsg() {
		return greetMsg;
	}

	public void setGreetMsg(String greetMsg) {
		this.greetMsg = greetMsg;
	}

	@Override
	public void sayHi() {
		System.out.println("Hi everyone...."+greetMsg);

	}

}
