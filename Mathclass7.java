package com.math;

import java.util.Scanner;

public class Mathclass7 {
	public static void main(String[] args) {
		int a , b , c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your a number");
		a = sc.nextInt();
		
		System.out.println("enter your b number");
		b = sc.nextInt();
		
		System.out.println("enter your c number");
		c = sc.nextInt();
		
//		where a^3 + b^3 + c^3 - 3abc = (a+b+c)(a^2 + b^2 + c^2 - ab - bc - ca)
		
		int d = ((a+b+c)*((a*a)+(b*b)+(c*c)-(a*b)-(b*c)-(c*a)));
		System.out.println("The Final Result is   "+ d);
	}
}
