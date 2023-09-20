package com.neotech.oh071223;

public class ArraysNonDuplicate {

	public static void main(String[] args) {

	//	Given an array nums with 7 integers every element is 
	//	repeated twice - except one. 
	//	Find that element and print it to console
		
	//nums -> [1, 1, 2, 3, 4, 3, 4]
		
		int[] nums = {1, 1, 2, 3, 4, 3, 4};
		
		
		//we start with the idea that the first element is unique
		
			//I need a for loop to go through all element (i)
				//I need another loop for the other elements in the array (j)
		
			// i = 0 , j = 0 --> nums[0] --> so, is the same element
			//only if i is different then j and the element is the same
		
		
		
		
		
//		int uniqueElement = 0;
		
		
		for (int i = 0; i < nums.length; i++) 
		//this for loop will have an index that points to one number
		{
			boolean unique = true;
			for (int j = 0; j < nums.length; j++)
			{
				if (i != j   && nums[i] == nums[j])
				{
					unique = false;
					break;
				}

			}
			
			if (unique)
			{
				System.out.println(nums[i]);
				break;
			}
			
		}
			
		
		
		

	}

}
