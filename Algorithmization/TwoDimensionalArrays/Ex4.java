package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
	/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 * 1	2	3	...	n
	 * n-1	n-2	n-3	...	1  
	 */

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("input n: ");
			int n = scan.nextInt();
			
			int[][] array = new int[n][n];			
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if(i % 2 == 0) {
						array[i][j] = j+1;
					}else {
						array[i][j] = n-j;
					}
		
				}
		
			}
			
			for (int i = 0; i < array.length; i++) {
				System.out.println(Arrays.toString(array[i]));
			}
			
		}
		
	}

}
