/**
 * 
 */
package com.practice;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/**
 * @author Lokesh
 */
public class CalculatorEx {
	
	public static void main(String[] args) {
		float result;
		System.out.println("enter a,b values");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		System.out.println("enter your choise");
		System.out.println("( 1-Addition, 2-Substraction, 3-Multiplication, 4-Division )");
		int choise=sc.nextInt();
		
		switch (choise) {
		case 1:
			result=a+b;
			System.out.println("result="+result);
			break;
		case 2:
			result=a-b;
			System.out.println("result="+result);
			break;
		case 3:
			result=a*b;
			System.out.println("result="+result);
			break;
		case 4:
			result=a/b;
			System.out.println("result="+result);
			break;

		default:
			System.out.println("Invalid option");
			break;
		}

	}

}
