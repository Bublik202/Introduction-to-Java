package Subroutines;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
	
	/**
	 * Составить программу, которая в массиве A[N] находит второе по величине число
	 * (вывести на печать число,которое меньше максимального элемента массива,
	 * но больше всех других элементов).
	 */
	public static void main(String[] args) {
		int[] array = arr();
		Arrays.sort(array);
		System.out.println("The number: "+array[array.length-2]);

	}
	
	public static int[] arr() {
		Scanner scan = new Scanner(System.in);
		System.out.print("input size of array: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*30)-10;
		}
		System.out.println("Data: "+Arrays.toString(array));
		return array;
	}

}
