package com.homework.empsystem;

import java.util.Scanner;

public class StartTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Menu menu = new Menu();
			System.out.println("*****************");
			System.out.println("Ѷ��Ա������ϵͳ");
			System.out.println("1.�鿴Ա��");
			System.out.println("2.��Ա����ְ");
			System.out.println("3.�鿴�ض�Ա��");
			System.out.println("4.���併��");
			System.out.println("5.��������");
			System.out.println("6.Ա����ְ");
			System.out.println("7.�뿪ϵͳ");
			System.out.println("*****************");
			while(true){
				Scanner input = new Scanner(System.in);
				System.out.println("please enter the number:");
				int number = input.nextInt();
				if(number != 7){
					switch (number) {
					case 1:
						menu.allEmpDetail();
					    break;
					case 2:
						menu.newEmployee();
						break;
					case 3:
						menu.empDetail();
						break;
					case 4:
						menu.ageDown();
						break;
					case 5:
						menu.salaryUp();
						break;
					case 6:
						menu.empLeave();
						break;
				}
				}else if(number == 7){
					menu.leaveSystem();
				}
					
		}
			
	} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Exception:"+e);
		}

	}

}
