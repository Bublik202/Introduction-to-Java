package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
	/**
	 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
	 */

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("input array string: ");
			int a = scan.nextInt();
			System.out.print("input array columns: ");
			int b = scan.nextInt();
			
			int[][] array = new int[10][10];
			int value = 1;
	        for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					array[i][j] = value;
					value++;						
				}				
	        }
	        
	        for (int i = 0; i < array.length; i++) {
				System.out.println(Arrays.toString(array[i]));
			}
	        
	        System.out.println("\nAnswer: "+array[a][b]);
	        
		}

	}

}
