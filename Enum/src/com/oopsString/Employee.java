package com.oopsString;

public class Employee {
	public static String name = "bhoomi";
	public static String name1= "bhoomi";
	public static String name2= name+"reddy";
	public static void main(String []args) {
		String s= new String ("bhoomi");
		String s1=new String("reddy");
		System.out.println(s1);
		System.out.println(s==s1);
	}
	

}
