package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
	/**
	 *  Найти положительные элементы главной диагонали квадратной матрицы
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("input n: ");
		int n = scan.nextInt();
		
		int[][] array = new int[n][n];
		int value = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = value++;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
		System.out.println("Even numbers diagonally: ");
		for (int i = 0, j = 0; i < n && j < n ; i++, j++) {
			if(array[i][j] % 2 == 0 )
			System.out.print(array[i][j]+" ");				
		}
		
	}

}
