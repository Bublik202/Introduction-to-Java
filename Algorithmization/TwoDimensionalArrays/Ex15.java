package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex15 {
	/**
	 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
	 */

	public static void main(String[] args) {
		System.out.print("input array string: ");
		int a = number();
		System.out.print("input array columns: ");
		int b = number();		
		
		int[][] array = new int[a][b];
		for (int i = 0; i < a; i++) {			
			for (int j = 0; j < b; j++) {
				array[i][j] = (int)(Math.random()*30);				
			}
		}
		System.out.println("\nData: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if(array[i][j] > max) {
					max = array[i][j];
				}
				if(array[i][j] % 2 !=0) {
					array[i][j] = max;
				}
			}
		}
		System.out.println("\nThe max number: "+max);
		System.out.println("Result: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
				
	}
	
	public static int number() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		return x;
	}

}
