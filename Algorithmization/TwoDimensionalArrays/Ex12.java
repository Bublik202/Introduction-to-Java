package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {
	/**
	 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов
	 */

	public static void main(String[] args) {
		System.out.print("input array string: ");
		int a = number();
		System.out.print("input array columns: ");
		int b = number();	
		
		int[][] array = new int[a][b];
		for (int i = 0; i < a; i++) {			
			for (int j = 0; j < b; j++) {
				array[i][j] = (int)(Math.random()*10);				
			}
		}
		
		System.out.println("Data: ");
		print(array);
		
		for (int j = 0; j < array.length; j++) {
			sortUp(array[j]);
		}
		
		System.out.println("Result Up: ");
		print(array);
		
		for (int j = 0; j < array.length; j++) {
			sortDown(array[j]);
		}
		
		System.out.println("Result Down: ");
		print(array);
		
	}
	public static void sortUp(int[] array) {
		boolean sort = true;
		while(sort) {
			sort = false;
			for (int i = 0; i < array.length-1; i++) {
				if(array[i] > array[i+1]) {
					int value = array[i];
					array[i] = array[i+1];
					array[i+1] = value; 
					sort = true;
				}
			}
		}
		
	}
	
	public static void sortDown(int[] array) {
		boolean sort = true;
		while(sort) {
			sort = false;
			for (int i = 0; i < array.length-1; i++) {
				if(array[i] < array[i+1]) {
					int value = array[i];
					array[i] = array[i+1];
					array[i+1] = value; 
					sort = true;
				}
			}
		}
		
	}
	
	public static int number() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		return x;
	}
	
	public static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));			
		}		
	}

}

 