package Subroutines;

import java.util.Scanner;

public class Ex16 {
	
	/**
	 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
	 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию
	 */
	public static void main(String[] args) {
		int n = 0;
		do {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("write natural number!");
			System.out.print("input n: ");
			n = scan.nextInt();
		} while (n <= 0);
		
		int fig = (int) Math.pow(10, n-1);
		int result = 0;
		for (int i = fig; i < fig*10; i++) {
			int[] array = remainder(i, n);
			if(checkOddNumber(array) == true) {
				result += i;
			}
		}	
		int count = checkEvenNumber(result, n);
		System.out.println("Result of odd number: "+result);	
		System.out.println("In this number -> "+ count  +" <- even numbers");

	}
	
	//каждая цифра передаваемого числа
	static int[] remainder(int N, int count) {
		int[] array = new int[count];
		int temp = 0;
		for (; 0 < count; count--) {
			temp = N % 10;
			array[count-1] = temp;
			
			N /=10;
		}
		return array;
	}
	
	//проверка числа на нечетные цифры
	static boolean checkOddNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				return false;
			}
		}
		return true;
	}
	
	//считает кол-во положительных цифр в числе
	static int checkEvenNumber(int result, int n) {
		int count = 0;	 	
		int[] array = remainder(result, count(result)); 
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	//считает количество цифр
	public static int count(int N) {
		int count = 0;
		while(N > 0) {
			N /=10;			
			count++;
		}
		return count;		
	}

}
