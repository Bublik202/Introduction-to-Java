package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
	/**
	 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
	 */

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("input array string: ");
			int a = scan.nextInt();
			System.out.print("input array columns: ");
			int b = scan.nextInt();		
			
			int[][] array = new int[a][b];
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
	        
	        System.out.println("\nNumbers diagonally: ");
			for (int i = 0, j = 0; i < a && j < b; i++, j++) {
				System.out.print(array[i][j]+" ");
			}	
					
		}
		
	}

}
