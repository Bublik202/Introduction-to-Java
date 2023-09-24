package basics.cycles;

import java.util.Scanner;

public class Ex1 {
	/**
	 * Напишите программу, где пользователь вводит любое целое положительное число.
	 * А программа суммирует все числа от 1 до введенного пользователем числа
	 */

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			int f=0;
			
			while(f<=0) {
				System.out.print("input f: ");
				f = scanner.nextInt();
				if(f <= 0) System.out.println("Please... input positive integer");
			}
			
			while (i <= f) {
			    sum += i;
			    i++;			    
            }
			
			System.out.println(sum);
		}	
		
	}
	
}
