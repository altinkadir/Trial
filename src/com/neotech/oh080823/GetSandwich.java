package com.neotech.oh080823;

import java.util.Scanner;

public class GetSandwich {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String str = scan.next();
    //Write your code here
     
     
     int firstIndex = str.indexOf("bread");
     int lastIndex = str.lastIndexOf("bread"); //-1
     
     if(firstIndex==lastIndex) {
      System.out.println("nothing");
     }else {
      System.out.println(str.substring(firstIndex+5, lastIndex));
     }


    
  }
}