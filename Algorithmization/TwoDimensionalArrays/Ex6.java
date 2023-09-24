package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
	/*  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 *  1	1	1	...	1
	 *  0	1	1	...	0
	 *  0	0	1	...	0
	 *  0	1	1	...	0
	 *  1	1	1	...	1  
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
		int l = n/2;		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {				
					if(i > j || n - i <= j) {
						array[i][j] = 0;
					}else {
						array[i][j] = 1;
					}
				if(i >= l) {
					if(n - i > j + 1 || i < j) {
						array[i][j] = 0;					
					}else {
						array[i][j] = 1;
					}
				}
			}
		}
	
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

	}

}
