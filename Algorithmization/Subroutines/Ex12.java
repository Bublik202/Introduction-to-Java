package Subroutines;

import java.util.Arrays;

public class Ex12 {
	
	/**
	 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
	 * являются числа, сумма цифр которых равна К и которые не большее N
	 */
	public static void main(String[] args) {
		int k = 5;
		int n = 100;		
		int count = 0;
		for (int i = 0; i < n; i++) {
			if(k == number(i) && i < n) {
				count++;
			}
		}
		int[] a = new int[count];
		int j = 0;
		for (int i = 0; i < n; i++) {
//			int num = i*10 + (k-i);		
			int temp = number(i);
			
			if(k == temp && i < n) {
				a[j++] = i;
			}
		}
		System.out.println("Result array: "+Arrays.toString(a));

	}
	
	static int number(int num) {
		int temp = 0;
		while(num != 0) {
			temp += num % 10;
			num/=10;			
		}
		return temp;
	}

}
