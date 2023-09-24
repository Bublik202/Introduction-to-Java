package OneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
	/**
	 * Дана последовательность целых чисел
	 * a a an
	 * Образовать новую последовательность, выбросив из
	 * исходной те члены, которые равны
	 * min(a1 a2 ... an) 
	 */

	public static void main(String[] args) {
		int[] array = arr();
		int n = 0;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {			
			if(array[i] < min) {
				min = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) { 
			if(min != array[i]) {
				n++;
			}
		}	
		
		int[] secArr = new int[n];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>min) {
				secArr[index] = array[i];
				index++;
			}
	
		}
		System.out.println("Count: "+(array.length-n)+" min: "+min);
		System.out.println(Arrays.toString(secArr));
	}
	
	public static int[] arr() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("input size of array: ");
			int n = scan.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = (int)(Math.random()*5)-5;
			}
			System.out.println("Data: "+Arrays.toString(array));
			return array;
		}
			
	}

}
