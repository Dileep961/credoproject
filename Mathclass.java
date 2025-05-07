package com.math;
import java.util.Scanner;
public class Mathclass {
		public static void main(String[] args) {
		int a,b ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your a number");
		a = sc.nextInt();
		
		System.out.println("enter your b number");
		b = sc.nextInt();
		
		int c = ((a*a)+(b*b)+2*a*b);
		System.out.println("the Final Result is  "+ c);
		}
	}


