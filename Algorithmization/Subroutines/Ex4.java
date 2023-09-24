package Subroutines;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {
	
	/**
	 * На плоскости заданы своими координатами n точек.
	 * Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. 
	 * Указание. Координаты точек занести в массив.
	 */
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("How many points? ");
		int n = scan.nextInt();
		
		//массив со случайными X 
		int[] arrayX = new int[n];
		for (int i = 0; i < arrayX.length; i++) {
			arrayX[i] = random.nextInt(-10, 10);
		}
		//массив со случайными Y
		int[] arrayY = new int[n];
		for (int i = 0; i < arrayY.length; i++) {
			arrayY[i] = random.nextInt(-15, 15);
		}
		//вывожу точки X и Y (X,Y)
		System.out.println("Data: ");
		for (int i = 0; i < n; i++) {
			System.out.println("("+arrayX[i]+","+arrayY[i]+")");
		}
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arrayX.length; i++) {
			for (int j = i+1; j < arrayX.length; j++) {
				int temp = (int) Math.sqrt(Math.pow(arrayX[j] - arrayX[i], 2)
						+ Math.pow(arrayY[j] - arrayY[i], 2));
				if(temp > max) {
					max = temp;
				}
			}
		}
		System.out.println("The max distance: "+max);
	
	}

}
