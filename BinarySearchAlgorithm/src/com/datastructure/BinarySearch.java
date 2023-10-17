package com.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Length of Array");
			int length=sc.nextInt();
			System.out.println("Enter the ELements of Array In Sorted Order as this is Binary Search");
			int[] arr=new int[length];
			for(int i=0;i<length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("The input array is: "+Arrays.toString(arr));
			System.out.println("Enter the Element you want to search");
			int element=sc.nextInt();
			sc.close();
			int result=computeBinarySearch(element,arr);
			if(result>0) {
				System.out.println("Element found at location: "+result);
			} else {
				System.out.println("Element not found in given Array");
			}
		}

		private static int computeBinarySearch(int element, int[] arr) {
			int beg=0,end=arr.length-1,mid;
			while(beg<=end) {
				mid=(beg+end)/2;
				if(arr[mid]==element) {
					return mid;
				} else if(arr[mid]<element) {
					beg=mid+1;
				} else if(arr[mid]>element) {
					end=mid-1;
				}
			}
			return -1;
		}
}





