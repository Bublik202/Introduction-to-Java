package TwoDimensionalArrays;

import java.util.Arrays;

public class Ex14 {
	/**
	 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
	 * причем в каждом столбце число единиц равно номеру столбца
	 */

	public static void main(String[] args) {
		int m = (int)(Math.random()*50)+2;	
		int n = (int)(Math.random()*25)+2;
		
		int[][] array = new int[m][n];
		int value = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if(i < j) {
					array[i][j] = value;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

	}

}
