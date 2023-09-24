package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
	/*  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 *  1	1	1	...	1
	 *  2	2	2	...	0
	 *  3	3	0	...	0
	 *  n-1	n-1	0	...	0
	 *  n	0	0	...	0  
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("input even number: ");
		    n = scan.nextInt();	
		} while (n%2!=0);
		
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {	
				if(n-i <= j) {
					array[i][j] = 0;					
				}else {
					array[i][j] = i+1;
				}
			
			}
		} 	
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}	
		
	}

}

