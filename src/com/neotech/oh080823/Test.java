package com.neotech.oh080823;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {


		
		
		List<String> colors = new ArrayList<>();
		colors.add("1");
		colors.add("2");
		colors.add("3");
		
		for (String s : colors)
		{
			if (s.equals("2"))
			{
				colors.remove(s);
			}
		}
		
		System.out.println(colors);
		
		
		
		
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);
		
		for (Integer num : numbers)
		{
			if (num % 2 == 0)
			{
				numbers.remove(num);
			}
		}
		
		System.out.println(numbers);
	}

}
