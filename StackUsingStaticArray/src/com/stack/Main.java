package com.stack;

public class Main {
	public static void main(String [ ] args) {
		System.out.println("Stating the Program");
		StackImplementation obj=new StackImplementation();
		
		System.out.println("Pushing 10");
		obj.push(10);
		System.out.println("Pushing 20");
		obj.push(20);
		System.out.println("Pushing 30");
		obj.push(30);
		
		System.out.println("Pushing 40");
		obj.push(40);
		
		System.out.println("Checking if Empty"+obj.isEmpty());
		
		System.out.println("Checking if Full"+obj.isFull());
		
		System.out.println("Poping Element");
		obj.pop();
		
		System.out.println("Checking Top"+obj.top());
		
		

	}

}
