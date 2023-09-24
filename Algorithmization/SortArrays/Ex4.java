package SortArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
	/**
	 * Сортировка обменами. Дана последовательность чисел a1 <= a2 <=...<= an.
	 * Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1.
	 * Если ai > ai+1, то делается перестановка. 
	 * Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
	 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
	 */

	public static void main(String[] args) {
		int[] array = arr();
		int count = 0;
		boolean sort = true;
		while(sort) {
			sort = false;
			for (int i = 0; i < array.length-1; i++) {
				if(array[i] > array[i+1]) {						
					int value = array[i];
					array[i] = array[i+1];
					array[i+1] = value; 
					count++;
					sort = true;
				}
			}
		}		
		System.out.println("Result: "+Arrays.toString(array));
		System.out.println("Count of changes: "+count);

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
