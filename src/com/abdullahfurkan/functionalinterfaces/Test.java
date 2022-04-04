package com.abdullahfurkan.functionalinterfaces;

public class Test implements Sayable{
	public void say(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		Test test=new Test();
		test.say("abdullahfurkankoc.com functional interface");
	}
	
}
