package com.homework.empsystem;

import java.util.Scanner;

public class StartTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Menu menu = new Menu();
			System.out.println("*****************");
			System.out.println("讯飞员工管理系统");
			System.out.println("1.查看员工");
			System.out.println("2.新员工入职");
			System.out.println("3.查看特定员工");
			System.out.println("4.年龄降序");
			System.out.println("5.工资升序");
			System.out.println("6.员工离职");
			System.out.println("7.离开系统");
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
