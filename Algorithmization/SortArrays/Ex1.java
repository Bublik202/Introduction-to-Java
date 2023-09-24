package SortArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
	/**
	 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
	 * Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого, 
	 * при этом не используя дополнительный массив.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.print("input one: ");
		int oneCount = scan.nextInt();
		System.out.print("input two: ");
		int twoCount = scan.nextInt();		
	    
		//Создаем с случайными числами 1 массив
		int[] oneArr = new int[oneCount+twoCount];
		for (int i = 0; i < oneCount; i++) {
			oneArr[i] = (int)(Math.random()*30);
		}
		System.out.println("Data one: ");
		for (int i = 0; i < oneCount; i++) {
			System.out.print(oneArr[i]+" ");
		}
		System.out.println();
		
		//Создаем с случайными числами 2 массив
		int[] twoArr = new int[twoCount];
		System.out.println("Data two: ");
		for (int i = 0; i < twoArr.length; i++) {
			twoArr[i] = (int)(Math.random()*30);
		}
		for (int i = 0; i < twoArr.length; i++) {
			System.out.print(twoArr[i]+" ");
		}
		System.out.println();
		
		System.out.print("input k: ");
		int k = scan.nextInt();	
		
		System.arraycopy(oneArr, k-1, oneArr, twoArr.length+k-1, oneCount-k+1);			
		System.arraycopy(twoArr, 0, oneArr, k, twoCount);
		
		System.out.println("Result: "+Arrays.toString(oneArr));
	}

}
