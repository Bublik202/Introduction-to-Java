package Subroutines;

import java.util.Scanner;

public class Ex14 {
	
	/**
	 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
	 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
	 * Для решения задачи использовать декомпозицию
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("input k: ");
		int k = scan.nextInt();
		
		int result = 0;
		for (int i = 1; i <= k; i++) {
			int num = i; 
			int n = count(num);			
			int[] array = remainder(num, n);
			
			result = armstrong(array, n);
			if(num == result) {
				System.out.print(result+" ");
			}
		}		

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
	
	//array - массив с цифрами
	//n - количество цифр
	static int armstrong(int[] array, int n) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {			
			result += Math.pow(array[i], n);
		}	
			
		return result;
	}

}
