package Subroutines;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
	
	/**
	 * Написать метод(методы) для нахождения наибольшего общего делителя
	 * и наименьшего общего кратного двух натуральных чисел:
	 * (НОК(А,B) = A*B/ НОД(A,B) 
	 */
	public static void main(String[] args) {
		int[] array = arr();
	    int gcdValue = gcd(array[0], array[1]);
		int lcmValue = lcm(array[0], array[1], gcdValue);
		
		System.out.println("GCD of two numbers: "+gcdValue);
		System.out.println("LCM of two numbers: "+lcmValue);
	
	}
	
	static int gcd(int p, int q) {
		if (q == 0 ) 
			return p;
		else
			return gcd(q, p % q); 
	}
	
	static int lcm(int p, int q, int gcdValue) {
		return Math.abs(p * q) / gcdValue;
	}
	
	public static int[] arr() {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[2];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*20)+1;
		}
		System.out.println("Data: "+Arrays.toString(array));
		return array;
	}

}
