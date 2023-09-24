package basics.cycles;

import java.util.Scanner;

public class Ex8 {
	/**
	 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
	 */

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("input x: ");
			int x = scanner.nextInt();
			System.out.print("input y: ");
			int y = scanner.nextInt();
			
			print(x,y);		

			int countX = count(x);
			int countY = count(y);
			
			int[] arrayX = remainder(x, countX);
			int[] arrayY = remainder(y, countY);
			
			System.out.println("matching numbers: ");
			for (int i = 0; i <= 9; i++) {
				if(compare(arrayX, i) && compare(arrayY, i)) {
					System.out.print(i+" ");
				}
			}

		}		
		
	}
	/**
	 * считает кол-во цифр в числе
	 * @param a передаваемое число
	 * @return кол-во цифр
	 */
	public static int count(int a) {
		int count = 0;
		while(a > 0) {
			a /=10;			
			count++;
		}
		return count;		
	}
	
	/**
	 * выводит каждую цифру передаваемого числа
	 * @param a число
	 * @param count кол-во цифр
	 * @return все цифры числа a
	 */
	public static int[] remainder(int a, int count) {
		int[] array = new int[count];
		int b = 0;
		for (int i = 0; i < count; i++) {
			b = a % 10;
			array[i] = b;
			
			a /=10;
		}
		return array;
	}
	
	public static void print(int a, int b) {
		System.out.println("Data: "+a+" and "+b);
	}
	
	public static boolean compare(int[] a, int b) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] == b) return true;
		}
		return false;
		
	}
	
	
}


	






