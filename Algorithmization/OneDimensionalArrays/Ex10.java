package OneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
	/**
	 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
	 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
	 */

	public static void main(String[] args) {
		int[] array = arr();
		for (int i = 1; i < array.length; i += 2) {
			array[i] = 0;		
		}
		System.out.print(Arrays.toString(array)+" ");
		

	}
	
	public static int[] arr() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("input size of array: ");
			int n = scan.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = (int)(Math.random()*2)-2;
			}
			System.out.println("Data: "+Arrays.toString(array));
			return array;
		}
	}

}
