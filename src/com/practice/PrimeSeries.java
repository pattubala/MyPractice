package com.practice;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

// Program to print Prime number series


public class PrimeSeries
{
	public static void main(String[] args)
	{
		System.out.println("enter n value");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=2;i < n;i++)
		{
			boolean isPrime=true;
			
			for(int j=2;i > j;j++)
			{	
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if (isPrime)
			{
				System.out.print(i +" ");
			}
			
			

		}
	}
}
