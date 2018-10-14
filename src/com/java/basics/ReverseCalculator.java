package com.java.basics;

public class ReverseCalculator {
	
	private int reverseNumberWhileLoop(int num){
		int reversedNumber = 0;
		while(num>0){
			int remainder = num%10;
			reversedNumber = reversedNumber * 10 + remainder;
			num/=10;
		}
		return reversedNumber;
	}

	private int reverseNumberForLoop(int num){
		int reversedNumber = 0;
		for(int i=num;i>0;i=i/10){
			int remainder = i%10;
			reversedNumber = reversedNumber * 10 + remainder;
		}
		return reversedNumber;
	}
	
	private int reverseNumberDoWhileLoop(int num){
		int reversedNumber = 0;
		do{
			int remainder = num%10;
			reversedNumber = reversedNumber * 10 + remainder;
			num/=10;
		} while(num>0);
		
		return reversedNumber;
	}
	
	public static void main(String[] args) {
		ReverseCalculator calculator = new ReverseCalculator();
		System.out.println(calculator.reverseNumberWhileLoop(123));
		System.out.println(calculator.reverseNumberForLoop(324));
		System.out.println(calculator.reverseNumberDoWhileLoop(789));

	}

}
