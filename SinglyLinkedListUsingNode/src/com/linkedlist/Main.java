package com.linkedlist;

public class Main {
	public static void main(String[] args) {
		System.out.println("Starting the Program");
		LinkedListImplementation obj=new LinkedListImplementation();
		obj.insertLink(5);
		obj.insertLink(45);
		obj.insertLink(56);
		obj.insertLink(57);
		obj.insertLink(50);
		
		obj.displayLinkList();
		System.out.println("\n");
		obj.deleteLink(56);
		
		obj.displayLinkList();
	}
}
