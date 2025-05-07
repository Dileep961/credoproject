package com.math;

import java.util.Scanner;

public class Mathclass5 {
	public static void main(String[] args) {
		int a , b , c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your a number");
		a = sc.nextInt();
		
		System.out.println("enter your b number");
		b = sc.nextInt();
		
		System.out.println("enter your c number");
		c = sc.nextInt();
		
//		where d => (a+b-c)^2 
		
		int d = ((a*a)+(b*b)+(c*c)+2*a*b-2*b*c-2*a*c);
		System.out.println("The Final Result is   "+ d);
}
}
