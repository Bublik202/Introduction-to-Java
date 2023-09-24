package Subroutines;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
	
	/**
	 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
	 */
	public static void main(String[] args) {
		int[] array = arr();
		gcdFirst(array[0], array[1]);
		gcdSecond(array[0], array[1], array[2]);
		int gcd = gcdThird(array[0], array[1], array[2], array[3]);
		System.out.println("GCD of four numbers: "+gcd);
  
	}
	static int gcdFirst(int p, int q) {
		if (q == 0 ) 
			return p;
		else
			return gcdFirst(q, p % q); 
	}
	//находим НОД сперва 2 и 3 числа затем находим НОД 1 и то что получилось в (2 и 3) 
	static int gcdSecond(int a, int b, int c) {
        return gcdFirst(a, gcdFirst(b, c));
    }
	
	//находим НОД 3 и 4 затем 2 и (3 и 4) потом 1 и 2 -> (3 и 4)
	static int gcdThird(int a, int b, int c, int d) {
        return gcdFirst(a, gcdSecond(b, c, d));
    }

	public static int[] arr() {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[4];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*1000)+1;
		}
		System.out.println("Data: "+Arrays.toString(array));
		return array;
	}

}
