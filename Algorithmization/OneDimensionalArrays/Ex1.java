package OneDimensionalArrays;

import java.util.Scanner;

public class Ex1 {
	/**
	 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
	 */

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int k;
			do {
				System.out.print("input k: ");
				k = scan.nextInt();		
			} while (k==0);
			
			
			int j = 1;
			int sum = 0 ;
			int[] arr = new int[20];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = j++;
				if(arr[i] % k == 0) {
					sum += arr[i];
					System.out.print(arr[i]+" ");				
				}
				
			}			
			String str = sum==0 ? "no multiples of "+k
								: "\nThe sum: "+sum;
			
			System.out.println(str);
		}

	}

}
