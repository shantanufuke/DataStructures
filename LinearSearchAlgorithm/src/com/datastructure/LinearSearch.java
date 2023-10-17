package com.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length of Array");
		int length=sc.nextInt();
		System.out.println("Enter the ELements of Array");
		int[] arr=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The input array is: "+Arrays.toString(arr));
		System.out.println("Enter the Element you want to search");
		int element=sc.nextInt();
		sc.close();
		int result=computeLinearSearch(element,arr);
		if(result>0) {
			System.out.println("Element found at location: "+result);
		} else {
			System.out.println("Element not found in given Array");
		}
	}

	private static int computeLinearSearch(int element, int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				return i;
			}
		}
		return -1;
		
	}
}
