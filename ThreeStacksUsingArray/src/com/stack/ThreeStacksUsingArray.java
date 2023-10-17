package com.stack;


public class ThreeStacksUsingArray {
	private int [] arr=new int[3];
	private int top1;
	private int top2;
	private int top3;
	
	ThreeStacksUsingArray() {
		this.top1=-1;
		this.top2=-1;
		this.top3=-1;
	}
	
	public void push(int n,int stackNumber) {
		if(stackNumber==1) {
			if(isFirstStackFull() ) {
				System.out.println("Error While Pushing Element");
			} else {
				top1=top1+1;
				arr[top1]=n;			
			}
		} else if (stackNumber==2) {
			if(isSecondStackFull()) {
				System.out.println("Error While Pushing Element");
			} else {
				top2=top2-1;
				arr[top2]=n;
			}
		}
	}
	
	public boolean isFirstStackEmpty() {
		if(top1==-1) 
			return true;
		else 
			return false;
	}
	
	public boolean isSecondStackEmpty() {
		if(top2==-1) 
			return true;
		else 
			return false;
	}
	public boolean isThirdStackEmpty() {
		if(top3==-1) 
			return true;
		else 
			return false;
	}
	public boolean isFirstStackFull() {
		if(top1==arr.length-1 || top1==top2-1) 
			return true;
		else 
			return false;
	}
	public boolean isSecondStackFull() {
		if(top2==0 || top2==top1+1) 
			return true;
		else 
			return false;
	}
	public int FirstStackTop() {
		return arr[top1];
	}
	public int SecondStackTop() {
		return arr[top2];
	}
	
	

}
