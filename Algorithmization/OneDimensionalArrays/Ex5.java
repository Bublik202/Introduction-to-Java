package OneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
	/**
	 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
	 */

	public static void main(String[] args) {		
		int[] array = arr();
		for (int i = 0; i < array.length; i++) {
			if(array[i]>i) System.out.print(array[i]+" ");
		}
        
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
