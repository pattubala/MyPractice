/*
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
 */
package com.practice;

import java.util.Scanner;

/**
 * @author Lokesh
 */
public class NumberPattern1 {


	public static void main(String[] args) {
		
		System.out.println("enter how many rows you need");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
				
			}
			for (int j = i; j <= rows; j++) {
				
				System.out.print(j);
			}	
			System.out.println();
		}
		
		// lower half
		
		for (int i = rows-1; i >=1; i--) {
			
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <=rows; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
