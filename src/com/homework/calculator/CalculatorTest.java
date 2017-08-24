package com.homework.calculator;

import java.util.Scanner;

public class CalculatorTest {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorJudge cj = new CalculatorJudge();
		isNumberJudge nj = new isNumberJudge();
		Scanner x = new Scanner(System.in);
		System.out.println("enter the first number:");
		String first = x.next();
		if (nj.isNumber(first)) {
			double firstNum = Double.parseDouble(first);
		} else {
			System.out.println("you should enter number!");
			System.exit(0);
		}
		double firstNum = Double.parseDouble(first);
		System.out.println("enter the method:");
		String method = x.next();
		System.out.println("enter the second number:");
		String second = x.next();
		if (nj.isNumber(second)) {
			double secondNum = Double.parseDouble(second);
		} else {
			System.out.println("you should enter number!");
			System.exit(0);
		}
		double secondNum = Double.parseDouble(second);
		if (method.equals("+")||method.equals("-")||method.equals("*")||method.equals("/")) {
			if(method.endsWith("/") && secondNum < 1){
				System.out.println("the second number is unlegal");
			}else{
				System.out.println("the result is:"+cj.Calculator(method, firstNum, secondNum));
			}
		} else {
			System.out.println("the method is unlegal(include +-*/)");
		}
	}
}
