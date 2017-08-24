package com.homework.search;

public class findNumber {
	public static int test1 (int [] arg){
		int sum = 0;  
		int number = 0;
        for(int i = 0; i < arg.length; ++i) {  
            sum += arg[i];  
        }  
        number = 5050 - sum;
        return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[99];//定一个100大小的整型数组
		for(int i=1;i<=99;i++){
			  arr[i-1] = i;//赋值1-100的数
			}
		System.out.println(findNumber.test1(arr));

	}

}
