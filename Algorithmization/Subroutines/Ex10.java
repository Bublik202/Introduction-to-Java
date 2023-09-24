package Subroutines;

import java.util.Arrays;

public class Ex10 {
	
	/**
	 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
	 * являются цифры числа N
	 */
	public static void main(String[] args) {
		int N = 30845;
		int countNum = count(N);
		int[] array = remainder(N, countNum);
		System.out.println("Result: "+Arrays.toString(array));
	}
	
	//считает количество цифр
	public static int count(int N) {
		int count = 0;
		while(N > 0) {
			N /=10;			
			count++;
		}
		return count;		
	}
	
	//выводит каждую цифру передаваемого числа
	public static int[] remainder(int N, int count) {
		int[] array = new int[count];
		int temp = 0;
		for (; 0 < count; count--) {
			temp = N % 10;
			array[count-1] = temp;
			
			N /=10;
		}
		return array;
	}

}
