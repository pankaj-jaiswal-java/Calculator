package com.pankaj.calculator;

import java.util.Scanner;

import com.pankaj.blogic.adictiv.*;
import com.pankaj.blogic.multiplicative.*;
//import com.pankaj.blogic.multiplicative.Multiplication;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("\t\3Wellcome to My Calculator\3");
		System.out.println("\t=============================");
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = "yes";
		String str2;
		
		do {
			double no1 = sc.nextDouble();
			char ch = sc.next().charAt(0);
			double no2 = sc.nextDouble();
			switch (ch) {
			case '+':
				System.out.println(Addition.add(no1, no2));
				break;
		
			case '-':
				System.out.println(Subtraction.sub(no1, no2));
				break;
			
			case '*':
				System.out.println(Multiplication.mul(no1, no2));
				break;
			
			case '/':
				System.out.println(Division.div(no1, no2));
				break;

			default:
				System.out.println("\n\nSyntex Error Found ");
				break;
			}
			System.out.println("\nu want any calculation");
			str2 = sc.next(); 	
		}while(str1.equals(str2));
		
		System.out.println("Thank You!");
		
	}
}
