package OneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
	/**
	 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
	 * большие данного Z, этим числом. Подсчитать количество замен.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("input z: ");
		int z = scan.nextInt();
		
		int count = 0;
		int j = -5;
		int[] array = new int[15];
		System.out.println("the array at the beginning: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = j++;
			System.out.print(array[i]+ " ");
		}
		for (int k = 0; k < array.length; k++) {
			if(array[k]>z) {
				array[k]=z;
				count++;
				
		    }		
										
		}
		System.out.println();
		System.out.print(Arrays.toString(array));
		System.out.print("\nnumber of swap: "+count);
	}

}
