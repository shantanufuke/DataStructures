package com.stack;

public class Main {
	public static void main(String[] args) {
		ThreeStacksUsingArray obj=new ThreeStacksUsingArray();
		System.out.println("Starting the Program");
		obj.push(10,1);
		obj.push(100, 2);
		obj.push(20,1);
		obj.push(200, 2);
		System.out.println("Printing Stack 1 Top "+obj.FirstStackTop());
		System.out.println("Printing Stack 2 Top "+obj.SecondStackTop());
	}
}

