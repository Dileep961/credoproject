package com.math;

import java.util.Scanner;

public class Mathclass3 {
	public static void main(String[] args) {
		int a , b ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your a number");
		a = sc.nextInt();
		
		System.out.println("enter your b number");
		b = sc.nextInt();
//		where c = (a^4 + B^4)
//				(a^4+b^4)=[(a+b)^2-2ab]^2 - 2(ab)^2
		int c = ((((a+b)*(a+b)) - 2*((a*b)*(a*b))) - 2*((a*b)*(a*b)) );
		System.out.println("the Final Result is  "+ c);
}
}