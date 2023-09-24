package SortArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
	/**
	 * СОРТИРОВКА ВЫБОРАМ. Дана последовательность чисел
     * a1 <= a2 <= ... <= an
     * Требуется переставить элементы так,
     * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого выбирается наибольший
     * элемент и ставится на первое место, а первый - на место наибольшего.
     * Затем, начиная со второго, эта процедура повторяется.
     * Написать алгоритм сортировки выбором 
	 */

	public static void main(String[] args) {
		int[] array = arr();
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}	
			int temp = array[i];
		    array[i] = array[min];
		    array[min] = temp;
		}
		System.out.println("Result: "+Arrays.toString(array));

	}
	
	public static int[] arr() {
		@SuppressWarnings("resource")
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
