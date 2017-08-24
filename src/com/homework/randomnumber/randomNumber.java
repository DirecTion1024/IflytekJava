package com.homework.randomnumber;

import java.util.Scanner;

public class randomNumber {
	public static double RandomNumber(int stnumber , int endnumber){   //传入随机数开始和结束范围
		int range = endnumber - stnumber;   //设置随机数范围置
		double result = Math.random()*range+stnumber;   //调用Math实体类生成随机数
		return result;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int stnumber = 0;
		int endnumber = 0;
		Scanner input = new Scanner(System.in);
		stnumber = NumberJudge.isNumber("enter the start number:");
		endnumber = NumberJudge.isNumber("enter the end number:");
		System.out.println(RandomNumber(stnumber, endnumber));
	}
}
