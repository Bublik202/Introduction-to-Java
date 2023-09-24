package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {
	/**
	 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
	 */

	public static void main(String[] args) {
		Random random = new Random();      
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the row: ");
		int row = scanner.nextInt();
		System.out.print("Enter the column: ");
		int column = scanner.nextInt();
		
		int[][] array = new int[row][column];		
	    for (int i = 0; i < row; i++) {
	    	for (int j = 0; j < column; j++) {
	    		array[i][j] = random.nextInt(100);
            }  
        }
	    
	    for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	    
	    for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(array[0][j] > array[row - 1][j] && j % 2 != 0) {
                	System.out.print(array[i][j] + " | ");
                }                
            }
            System.out.println();
        }
	}

}

