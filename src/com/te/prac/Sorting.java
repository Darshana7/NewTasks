package com.te.prac;

import java.util.Arrays;

public class Sorting {
	
	public static void main(String[] args) {
		int []a={6,8,2,3,7};
		int temp;
		//print Array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);	
		}
		System.out.println("====");
		//Sort Array
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp= a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//Print sorted array
		for(int x:a) {
			System.out.println(x);
		}
		System.out.println("====");
		//Sort Array using collection
//		Arrays.sort(a);
//		for(int i=0; i<=a.length-1; i++) {
//			System.out.println(a[i]);
//		}
		//Print largest using sorting
		System.out.println("Largest of array "+ a[a.length-1]);
		//Print without sorting
		int [] array= {44,66,99,-111,465};
		int smallest=a[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]<smallest)
				smallest=array[i];
		}
		System.out.println("Smallest is " +smallest);
		
	}

}
