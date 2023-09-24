package SortArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {
	/**
	 * Даны две последовательности
     * a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm  Образовать из них новую последовательность 
     * чисел так, чтобы она тоже была неубывающей. 
     * Примечание. Дополнительный массив не использовать
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("input fir: ");	
		int firCount = scan.nextInt();
		System.out.print("input sec: ");
		int secCount = scan.nextInt();
		Random random = new Random();
		
		//Создал с случайными числами 1 массив
		int[] oneArr = new int[firCount+secCount];
		for (int i = 0; i < firCount; i++) {
			oneArr[i] = random.nextInt(15);
		}
		System.out.println("Data one: ");
		for (int i = 0; i < oneArr.length; i++) {
			System.out.print(oneArr[i]+" ");
		}
		System.out.println();
		
		//Создал с случайными числами 2 массив
		int[] twoArr = new int[secCount];		
		for (int i = 0; i < twoArr.length; i++) {
			twoArr[i] = random.nextInt(15);
		}
		for (int i = 0; i < twoArr.length; i++) {
			System.out.print(twoArr[i]+" ");
		}
		System.out.println();
		
		System.arraycopy(twoArr, 0, oneArr, firCount, secCount);
		
		//сортировка строк по возрастанию
		boolean sort = true;
		while(sort) {
			sort = false;
			for (int i = 0; i < oneArr.length-1; i++) {
				if(oneArr[i] > oneArr[i+1]) {
					int value = oneArr[i];
					oneArr[i] = oneArr[i+1];
					oneArr[i+1] = value; 
					sort = true;
				}
			}
		}
		
		System.out.println("Result: "+Arrays.toString(oneArr));		

	}

}
