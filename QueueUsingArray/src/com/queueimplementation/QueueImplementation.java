package com.queueimplementation;

public class QueueImplementation {
	private int size;
	private int[] arr;
	private int front;
	private int rear;
	
	QueueImplementation(int size) {
		this.size=size;
		arr=new int [size];
		front=0;
		rear=-1;
	}
	
	public boolean isFull() {
		if(rear==(arr.length-1)) 
			return true;
		else 
			return false;
	}
	
	public boolean isEmpty() {
		if(rear < front) 
			return true;
		else 
			return false;
	}
	
	public void enqueue(int element) {
		if(isFull()) {
			System.out.println("The Queue is Full");
		} else {
			rear++;
			arr[rear]=element;
		}
	}
	
	public int dequeue() {
		int result;
		if(isEmpty()) {
			System.out.println("The Queue is Empty");
			result=-1;
		} else {
			result=arr[front];
			front++;
		}
		return result;
	}
	
	public int peak() {
		int result;
		if(isEmpty()) {
			System.out.println("The Queue is Empty");
			result=-1;
		} else {
			result=arr[front];
		}
		return result;
	}
}