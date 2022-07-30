package com.createiq.Demo;

public class TestSamDemo {
	public static void main(String[] args) {
	//	SAMDemo samDemo = new SAmDEmoImple();
	// 	System.out.println(samDemo.sayHello());
		
		
		
	//	or by using inner classes
		SAMDemo  samDemo1 = new SAMDemo() {
			
			@Override
			public String sayHello() {
				// TODO Auto-generated method stub
				return "HEllo Saritha";
			}
		}; 
		System.out.println(samDemo1.sayHello());
		
		
SAMDemo  samDemo2 = new SAMDemo() {
			
			@Override
			public String sayHello() {
				// TODO Auto-generated method stub
				return "HEllo Aadya";
			}
		}; 
		System.out.println(samDemo2.sayHello());
	
	}

}
