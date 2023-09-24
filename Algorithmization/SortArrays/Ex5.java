package SortArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex5 {
	
	/**
	 * Сортировка вставками. Дана последовательность чисел
	 * n a ,a , ,a 1 2 
	 * Требуется переставить числа в порядке
	 * возрастания. Делается это следующим образом. Пусть a a ai ...  1 2  - упорядоченная последовательность, т. е.
     * a1 <= a2 <= ... <= an Берется следующее число i+1 a
     * и вставляется в последовательность так, чтобы новая
     * последовательность была тоже возрастающей.
     * Процесс производится до тех пор, пока все элементы от i +1 до n не будут перебраны.
     * Примечание. Место помещения очередного элемента в отсортированную часть производить
     * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
	 */
	public static void main(String[] args) {
		int[] array = arr();
		for (int i = 1; i < array.length; i++) {
			int value = array[i];
			int j = i-1;			
			int index = binarySearch(array, value, i);
			
			//меняем числа и ставим наше число на тот индекс
			while(j >= index) {						
				array[j+1] = array[j];	
				j--;												
			}
			array[index] = value;						
		}
		System.out.println("Result: "+Arrays.toString(array));
	}
	
	public static int binarySearch(int[] array, int value, int endIndex) {
		//находим индекс куда вставлять число чтоб отсортировать массив
		int startIndex = 0;
		int midIndex;
				
		while(startIndex <= endIndex) {
			midIndex = startIndex + (endIndex - startIndex) / 2;
			if(array[midIndex]==value) {
				return midIndex;
			}
			
			if(array[midIndex] > value) {			
				endIndex = midIndex - 1;
			}else {
				startIndex = midIndex + 1;
			}					
		}
		return startIndex;		
	}	
	
	public static int[] arr() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("input size of array: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(-10, 30);
		}
		
		System.out.println("Data: "+Arrays.toString(array));
		return array;
   }

}
