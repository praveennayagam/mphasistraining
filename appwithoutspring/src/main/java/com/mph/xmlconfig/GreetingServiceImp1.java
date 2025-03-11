package com.mph.xmlconfig;

public class GreetingServiceImp1 implements GreetingService {

	private String greetMsg;

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
