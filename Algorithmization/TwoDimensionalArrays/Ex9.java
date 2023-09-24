package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
	/**
	 *  Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. 
	 *  Определить, какой столбец содержит максимальную сумму
	 */

	public static void main(String[] args) {
		System.out.print("input array string: ");
		int a = number();
		System.out.print("input array columns: ");
		int b = number();
		
		int[][] array = new int[a][b];
		int value = 0;
		for (int i = 0; i < a; i++) {						
			for (int j = 0; j < b; j++) {
				array[i][j] = value +=2;
			}
		}
		int sum = 0;
		int k = 0;
		for (int i = 0; i < b; i++) {
			int count = 0;
			for (int j = 0; j < a; j++) {
				count += array[j][i];
				if(count>sum) {
					k = i;
				}
			}
			sum = Math.max(sum, count);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
		System.out.println("max columns: "+k);
		System.out.println("the sum: "+sum);
	
	}
	public static int number() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		return x;
	}

}
