package SortArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
	
	/**
	 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
	 * Делается это следующим образом: сравниваются два соседних элемента
	 * ai и ai+1 Если ai <= ai+1, то продвигаются на один элемент вперед. Если ai > ai+1
	 * то производится перестановка и сдвигаются на один элемент назад.
	 * Составить алгоритм этой сортировки
	 */
	public static void main(String[] args) {
		int[] array = arr();
		Sort(array);		
		System.out.println("Result: "+Arrays.toString(array));
	}
	
	public static void Sort(int[] array) {
		int n = array.length;
		int gap = n/2;
		for (int i = 0; i < gap; i++) {				
			if(array[i] > array[i + gap]) {
			  int temp = array[i];
			  array[i] = array[i + gap];
			  array[i + gap] = temp;
			}				
		}
		
		gap/= 2;
		int count = 0;
		while(count < gap) {
			for (int j = count; j < array.length; j+=gap) {
				int value = array[j];				
				while(j > count && array[j - gap] > value) {						
					array[j] = array[j - gap];	
					j-= gap;												
				}
			array[j] = value;
			}
			count++;
		}
		for (int j = 0; j < array.length; j++) {
			int value = array[j];
			while(j > 0 && array[j - 1] > value) {						
				array[j] = array[j-1];	
				j--;												
			}
			array[j] = value;
		}
		
		
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
