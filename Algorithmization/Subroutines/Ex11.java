package Subroutines;

import java.util.Random;

public class Ex11 {
	
	/**
	 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(1, 10000);
		int b = random.nextInt(1, 1000);
		System.out.println("The number A: "+a);
		System.out.println("The number B: "+b);
		
		int countA = count(a);
		int countB = count(b);
		
		if(countA > countB) {
			System.out.println("The Number: " +"'A'"+ "have more number than B");
		}else if(countA == countB) {
			System.out.println("all these numbers have the same number of digits");
		}else {
			System.out.println("The Number: " + "'B'" + " have more number than A");
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

}
