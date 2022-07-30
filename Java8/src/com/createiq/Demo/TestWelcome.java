package com.createiq.Demo;

import java.util.function.Consumer;
import java.util.function.Function;

public class TestWelcome {
	public static void main(String[] args) {
	//	Welcome welcome = ( name) -> {
	 //		System.out.println("Hello"  +  name);
	//	};
		// welcome.SayWelcome(" saritha R");
		
		
		// another way for lambda expression
		
		Welcome welcome =  name -> System.out.println("Hello"  +  name);
		welcome.SayWelcome(" saritha R");
		
		
		
		
		Function<String, String> lowerToUpperFun = (str)-> str.toUpperCase();
		String result = lowerToUpperFun.apply("saritha");
		System.out.println();
		System.out.println("Result : " +  result);
		
		
		// <a,b> a is input, b is return type
		Function<String, Integer> findStrCount = str -> str.length(); 
		Integer count =  findStrCount.apply("saritha");
		System.out.println(count);
		
		Consumer<String >consumer = str -> System.out.println(str);
		consumer.accept("saritha");
		
	}

}
