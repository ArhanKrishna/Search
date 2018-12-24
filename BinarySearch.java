/*
 * Binary Search Algorithm Implementation
 * 
 * For Binary search, we need sorted array
 * If middle element is less than key, then we consider right side array for searching
 * If middle element is greater than key, then we consider left side array for searching
 * If firstIndex of array is greater than or equal to lastIndex, then key not found
 * 
 */
package com.search;

import java.util.Scanner;

public class BinarySearch {

	public int binarySearch(int arr[], int key) {
	
		int firstIndex = 0;
		int lastIndex = arr.length - 1;
		
		while(lastIndex>=firstIndex) {
		int middleIndex = (firstIndex + lastIndex)/2;
		if(arr[middleIndex] == key) {
			return middleIndex+1;
		}
		if(arr[middleIndex] > key) {
			lastIndex = middleIndex-1;
		}
		if(arr[middleIndex] < key) {
			firstIndex = middleIndex+1;
		}
	  }
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		BinarySearch bs = new BinarySearch();
		int list[] = new int[100];
		for(int i=9,j=0; i<=99; i++,j++) {
			list[j]=i;
		}
		System.out.println("Enter number to search from 9 to 99");
		Scanner sc = new Scanner(System.in);
		int index = bs.binarySearch(list,sc.nextInt());
		if(index != -1) {
			System.out.println("Value found at index of "+index);
		}else {
			System.out.println("value not found");
		}
		sc.close();
	}
}
