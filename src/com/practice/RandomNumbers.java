/**
 * 
 */
package com.practice;

import java.util.Random;

/**
 * @author Lokesh
 */
public class RandomNumbers 
{
	  public static void main(String[] args) 
	  {
		  int c;
		  Random t = new Random();
		  for (c = 1; c <= 5; c++)
		  {
			  System.out.println(t.nextInt(1000000));
		  }
	  }
}
