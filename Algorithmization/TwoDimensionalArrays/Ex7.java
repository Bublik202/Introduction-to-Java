package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
	/* Сформировать квадратную матрицу порядка N по правилу:
	 * A[I,J]=sin((I^2-J^2)/N)
	 * и подсчитать количество положительных элементов в ней
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("input n: ");
		int n = scan.nextInt();
		
		double[][] array = new double[n][n];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] =  Math.sin(Math.pow(i, 2) - Math.pow(j, 2) / n);
				if(array[i][j] > 0 ) {
					count++;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
		System.out.println("positive numbers: "+count);

	}

}
