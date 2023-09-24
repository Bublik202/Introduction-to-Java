package OneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
	/**
	 * Даны действительные числа
	 * a a an
	 * Найти max(a1 + a2n a2 + a2n−1 ... an + an+1)
	 */

	public static void main(String[] args) {
		int[] array = arr();
		int maxSum=Integer.MIN_VALUE;
//		for (int i = 0; i < array.length; i++) {
//			int max = array[i]+ array[array.length-1-i];
//			if(max > maxSum) {
//				maxSum = max;
//			}
//		}
		
		for (int i = 0, j = array.length-1; i < j; i++, j--) {
			int max = array[i]+ array[j];
			if(max > maxSum) {
				maxSum = max;
			}
		}
		
		System.out.println("The max number: "+maxSum);
					
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
