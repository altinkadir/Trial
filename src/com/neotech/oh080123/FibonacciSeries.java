package com.neotech.oh080123;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
	  }
	  
	  public static void fib(int num){
	    //WRITE YOUR CODE HERE
	  
		  //[0, 1, 1, 2, 3, 5, 8]
		  //arr[0], 1st term
		  
		  
		  //the first two elements of the series are always: 
		  //1st --> 0
		  //2nd --> 1
	
		  
		  int[] arr = new int[num+1];
		  
//		  arr[0] = 0; //I dont have to write this, because all the elements are 0 
		  arr[1] = 1; 
		  
		  //lets do this manually
		//  arr[2]= arr[1]+arr[0];
		//  arr[3] = arr[2]+arr[1];
		//  arr[4] = arr[3] + arr[2];
		  
		  //automatically
		  
		  for (int i = 0; i < arr.length - 2; i++)
		  {
			  //when i = 0:
			  	// arr[i+2]= arr[i+1] + arr[i]
			  //when i = 1: 
			  	//
			  arr[i+2] = arr[i+1] + arr[i];
		  }
	  
		  
		  
		  
		  
		  //same solution
			/*
			 * for (int i = 2; i <= num; i++) { arr[i] = arr[i-1] + arr[i-2]; }
			 */
		  
		  
		  
		  System.out.println(arr[num]);
		  
		  
		  
		  
		  
	  }

}
