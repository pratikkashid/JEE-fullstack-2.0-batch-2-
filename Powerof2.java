package com.cg.practice;

import java.util.Scanner;

public class Powerof2{
	
	private static boolean checknumber(int n) {
		// TODO Auto-generated method stub
		 while(n % 2==0) {//number even or not
	            n=n/2;//4,2,1
	                }
	        if(n==1) {
	            return true;
	        }
	        else {
	            return false;
	        }
	}
	
	private static void checkpower(int n) {
		// TODO Auto-generated method stub
		if(checknumber(n)) {
			System.out.println("number is power of two");
			int count = 0;
			while(n % 2==0) {//number even or not
	            n=n/2;
				count++;
	                }
		System.out.println("power is ="+count);
		}
		else {
			System.out.println("number is not power of two");
		}
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number");
		int n  = sc.nextInt();
		sc.close();
		checknumber(n);
		checkpower(n);
		System.out.println("ok");
	}





	

	
}
