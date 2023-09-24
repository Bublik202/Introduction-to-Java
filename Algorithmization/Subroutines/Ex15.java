package Subroutines;

import java.util.Scanner;

public class Ex15 {
	
	/**
	 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
	 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию
	 */
	public static void main(String[] args) {
		int n = 0;
		do {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("write natural number!");
			System.out.print("input n: ");
			n = scan.nextInt();
		} while (n <= 0);
		
		int fig = (int) Math.pow(10, n-1);	
		for (int i = fig; i < fig*10; i++) {
			int[] arr = remainder(i, n);
			if(check(arr) == true) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	//каждая цифра передаваемого числа
	static int[] remainder(int N, int count) {
		int[] array = new int[count];
		int temp = 0;
		for (; 0 < count; count--) {
			temp = N % 10;
			array[count-1] = temp;
			
			N /=10;
		}
		return array;
	}
	
	//сортировка массива если оно хочет сортировать то (return false)
	static boolean check(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[min] >= array[j]) {
					return false;
				}
			}	
		}
		return true;
	}

}
