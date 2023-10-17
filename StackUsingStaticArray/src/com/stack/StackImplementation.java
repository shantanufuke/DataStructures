package com.stack;

public class StackImplementation {
	private int [] arr=new int[2];
	private int top;

	StackImplementation() {
		top=-1;
	}
	
	public boolean isFull() {
		if(top==arr.length-1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(top==-1) 
			return true;
		return false;
	}
	
	public void push(int element) {
		if(isFull())  {
			System.out.println("Stack is Full");
		} else {
			top=top+1;
			arr[top]=element;
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			top=top-1;
		}
	}
	public int top() {
		if(isEmpty() ) {
			System.out.println("Stack is Empty");
			return 0;
		} else {
			return arr[top];
		}
	}
	

}
