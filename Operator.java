package com.math;
import java.util.Scanner;

public class Operator {
public static void main(String[] args) {
	int number;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your nubmer ");

	number = sc.nextInt();

	String result = (number > 0) ? "positive" : "negative";

	System.out.println("the final result is ..................." + result);

}
}
