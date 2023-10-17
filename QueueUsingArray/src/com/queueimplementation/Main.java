package com.queueimplementation;

public class Main {
	public static void main(String [] args) {
		QueueImplementation obj=new QueueImplementation(6);
		System.out.println("Starting the Process\n");
		
		System.out.println("Checking if queue is empty \n"+obj.isEmpty());
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		obj.enqueue(5);
		obj.enqueue(6);
		
		System.out.println("Trying to enqueue in full queue");
		obj.enqueue(11);
		
		System.out.println("element  peak "+obj.peak());
		System.out.println("dequeing the elemtn "+obj.dequeue());
		
		
		System.out.println("element  peak "+obj.peak());
		System.out.println("dequeing the elemtn "+obj.dequeue());
		
		System.out.println("element  peak "+obj.peak());
		System.out.println("dequeing the elemtn "+obj.dequeue());
		
		System.out.println("element  peak "+obj.peak());
		System.out.println("dequeing the elemtn "+obj.dequeue());
		
		System.out.println("element  peak "+obj.peak());
		System.out.println("dequeing the elemtn "+obj.dequeue());
		
		System.out.println("element  peak "+obj.peak());
		System.out.println("dequeing the elemtn "+obj.dequeue());
		


	}
}
