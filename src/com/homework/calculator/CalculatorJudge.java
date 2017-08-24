package com.homework.calculator;

public class CalculatorJudge {
	public double Calculator(String tpye,double firstNum,double secondNum){
		CalculatorMethod cm = new CalculatorMethod();
		double result = 0;
		if(tpye.equals("+")){
			result = cm.add(firstNum, secondNum);
			
		}else if(tpye.endsWith("-")){
			result = cm.sub(firstNum, secondNum);
			
		}else if(tpye.endsWith("*")){
			result = cm.multi(firstNum, secondNum);
			
		}else if(tpye.endsWith("/")){
			result = cm.div(firstNum, secondNum);
		}
		return result;
	}

}
