package com.homework.randomnumber;

import java.util.Scanner;

public class randomNumber {
	public static double RandomNumber(int stnumber , int endnumber){   //�����������ʼ�ͽ�����Χ
		int range = endnumber - stnumber;   //�����������Χ��
		double result = Math.random()*range+stnumber;   //����Mathʵ�������������
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
