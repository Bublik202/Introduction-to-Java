package Subroutines;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
	
	/**
	 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]
	 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
	 * массива с номерами от k до m
	 */
	public static void main(String[] args) {
		int[] D = arr();
		int sumFirst = calcSum(D, 0);
		int sumSecond = calcSum(D, 2);
        int sumThird = calcSum(D, 3);
        
        System.out.println("First sum: " + sumFirst);
        System.out.println("Second sum: " + sumSecond);
        System.out.println("Third sum: " + sumThird);
	}
	
	public static int calcSum(int[] arr, int k) {
        int sum = arr[k] + arr[k + 1] + arr[k + 2];
        return sum;
    }
	
	public static int[] arr() {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10)+1;
		}
		System.out.println("Data: "+Arrays.toString(array));
		return array;
	}

}
