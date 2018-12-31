/* 
 * PROGRAM TO IMPLEMENT LINEAR SEARCH ALGORITHM
 * 
 * Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
 * If x matches with an element, return the index.
 * If x doesn’t match with any of elements, return -1.
 */

package com.search;

import java.util.Scanner;

public class LinearSearch {

	public int linearSearch(int arr[], int key) {
		
		int length = arr.length;
		for(int i=0; i<length; i++) {
			if(arr[i] == key) {
				return i+1;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		LinearSearch ls = new LinearSearch();
		int list[] = new int[100];
		for(int i=9,j=0; i<=99; i++,j++) {
			list[j]=i;
		}
		System.out.println("Enter number to search from 9 to 99");
		Scanner sc = new Scanner(System.in);
		int index = ls.linearSearch(list,sc.nextInt());
		if(index != -1) {
			System.out.println("Value found at position of "+index);
		}else {
			System.out.println("value not found");
		}
		sc.close();
	}
}
