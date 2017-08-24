package com.homework.empsystem;

import java.util.Scanner;

public class Menu implements Methods{
	@Override
	public void allEmpDetail() {
		// TODO Auto-generated method stub
		System.out.println("uuid"+" "+"name"+" "+"age"+" "+"salary");
		System.out.println("0001"+" "+"empl"+" "+"10"+" "+"1000");
		System.out.println("0002"+" "+"emp2"+" "+"12"+" "+"1500");
		System.out.println("0003"+" "+"emp3"+" "+"13"+" "+"1234");
		System.out.println("0004"+" "+"emp4"+" "+"14"+" "+"1800");
		System.out.println("0005"+" "+"emp5"+" "+"16"+" "+"2000");

	}

	@SuppressWarnings({ "resource", "unused" })
	@Override
	public void newEmployee() {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the uuid:");
		String uuid = input.nextLine();
		if(!NumberJudge.isNumber(uuid)){
			System.out.println("please enter the number");
			System.out.println("please enter the uuid:");
			String uuid2 = input.nextLine();
			
		}
		System.out.println("please enter the name:");
		String name = input.nextLine();
		System.out.println("please enter the age:");
		String age = input.nextLine();
		System.out.println("please enter the salary:");
		String salary = input.nextLine();
	}

	@SuppressWarnings("resource")
	@Override
	public void empDetail() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the uuid:");
		int uuid = input.nextInt();
		switch (uuid) {
		case 0001:
			System.out.println("0001"+" "+"empl"+" "+"10"+" "+"1000");
			break;
		case 0002:
			System.out.println("0002"+" "+"emp2"+" "+"12"+" "+"1500");
			break;
		case 0003:
			System.out.println("0003"+" "+"emp3"+" "+"13"+" "+"1234");
			break;
		case 0004:
			System.out.println("0004"+" "+"emp4"+" "+"14"+" "+"1800");
			break;
		case 0005:
			System.out.println("0005"+" "+"emp5"+" "+"16"+" "+"2000");
			break;

		default:
			System.out.println("do not find the employee");
			break;
		}

	}

	@Override
	public void ageDown() {
		// TODO Auto-generated method stub
		System.out.println("ageDown");
		System.out.println("uuid"+" "+"name"+" "+"age"+" "+"salary");
		System.out.println("0005"+" "+"emp5"+" "+"16"+" "+"2000");
		System.out.println("0004"+" "+"emp4"+" "+"14"+" "+"1800");
		System.out.println("0003"+" "+"emp3"+" "+"13"+" "+"1234");
		System.out.println("0002"+" "+"emp2"+" "+"12"+" "+"1500");
		System.out.println("0001"+" "+"empl"+" "+"10"+" "+"1000");
	}

	@Override
	public void salaryUp() {
		// TODO Auto-generated method stub
		System.out.println("salaryUp");
		System.out.println("uuid"+" "+"name"+" "+"age"+" "+"salary");
		System.out.println("uuid"+" "+"name"+" "+"age"+" "+"salary");
		System.out.println("0001"+" "+"empl"+" "+"10"+" "+"1000");
		System.out.println("0003"+" "+"emp3"+" "+"13"+" "+"1234");
		System.out.println("0002"+" "+"emp2"+" "+"12"+" "+"1500");
		System.out.println("0004"+" "+"emp4"+" "+"14"+" "+"1800");
		System.out.println("0005"+" "+"emp5"+" "+"16"+" "+"2000");

	}

	@SuppressWarnings({ "unused", "resource" })
	@Override
	public void empLeave() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("please enther the uuid:");
		String uuid = input.next();
		if(!NumberJudge.isNumber(uuid)){
			System.out.println("please enter the number");
			System.out.println("please enter the uuid:");
			String uuid1 = input.nextLine();
		}
		System.out.println("are you sure?");
		String sure = input.next();
		if(sure.equals("y")){
			System.out.println("employee leave success");
		}else if(sure.equals("n")){
			System.out.println("employee leave cancle");
		}

	}

	@SuppressWarnings("resource")
	@Override
	public void leaveSystem() {
		// TODO Auto-generated method stub
		System.out.println("are you sure leave system?");
		Scanner input = new Scanner(System.in);
		String sure = input.next();
		if(sure.equals("y")){
			System.out.println("leave system success");
			System.exit(0);
		}else if(sure.equals("n")){
			System.out.println("not leave system");
		}
		
	}

}
