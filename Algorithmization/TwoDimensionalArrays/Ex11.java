package TwoDimensionalArrays;

import java.util.Arrays;

public class Ex11 {
	/**
	 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу
	 * и номера строк, в которых число 5 встречается три и более раз.
	 */

	public static void main(String[] args) {
		int[][] array = new int[10][20];		
		for (int i = 0; i < 10; i++) {			
			for (int j = 0; j < 20; j++) {
				array[i][j] = (int)(Math.random()*10);				
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
		System.out.print("\nString #: [ " );
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array[0].length; j++) {
				if(array[i][j] == 5) {
					count++;
				}			
			}
			if(count >= 3) {
				System.out.print((i+1)+" ");
			}
		}
		System.out.println("]");
		
	}

}
