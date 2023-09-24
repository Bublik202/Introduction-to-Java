package Subroutines;

import java.util.Scanner;

public class Ex17 {
	
	/**
	 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
	 * Сколько таких действий надо произвести, чтобы получился нуль? 
	 * Для решения задачи использовать декомпозицию
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("input number: ");
		int number = scan.nextInt();
		int count = 0;
		while(number !=0) {
			int temp = 0;
			int[] array = remainder(number,count(number));
			for (int i = 0; i < array.length; i++) {
				temp += array[i];
			}
			number = number - temp;
			count++;
		}
		System.out.println("Count: "+count);

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
