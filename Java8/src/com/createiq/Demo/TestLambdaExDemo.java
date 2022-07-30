package com.createiq.Demo;

public class TestLambdaExDemo {
public static void main(String[] args) {
	
	
	//  syntax for lambda () --> {}
	SAMDemo samdemo = () -> {
		return " hello saritha";
		
	};
	System.out.println(samdemo.sayHello());
}
}
