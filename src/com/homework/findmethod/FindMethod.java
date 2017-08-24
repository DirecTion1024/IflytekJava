package com.homework.findmethod;

public class FindMethod {
	public static float sqrtNewton(float num, float e) {
        
        float guess = num / 2;
        float e0;
        int count = 0;
        
        do {
               guess = (guess + num / guess) / 2;
               e0 = guess*guess - num;
               
               count++;
               System.out.printf("Try %f, e: %f\n", guess, e0);
        } while (e0 > e);

        System.out.printf("Try %d times, result: %f\n", count, guess);
        
        return guess;
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		System.out.println(FindMethod.sqrtNewton(a, 1));
	}
}
