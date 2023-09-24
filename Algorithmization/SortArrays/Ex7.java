package SortArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex7 {
	
	/**
	 * 7. Пусть даны две неубывающие последовательности действительных чисел
	 * a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
	 * Требуется указать те места, на которые нужно вставлять элементы последовательности
	 * b1 <= b2 <= ... <= bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("input first array: ");	
		int firCount = scan.nextInt();
		System.out.print("input second array: ");
		int secCount = scan.nextInt();
		Random random = new Random();
		
		int[] arrayOne = new int[firCount];
		for (int i = 0; i < firCount; i++) {
			arrayOne[i] = random.nextInt(-5, 15);
		}
		int[] arrayTwo = new int[secCount];		
		for (int i = 0; i < arrayTwo.length; i++) {
			arrayTwo[i] = random.nextInt(-5, 15);
		}
		
		System.out.println("Data first array: "+Arrays.toString(arrayOne));
		System.out.println("Data second array: "+Arrays.toString(arrayTwo));
		
		System.out.println("------------------------------------------");
		Ex6 task = new Ex6();
		task.Sort(arrayOne);
		task.Sort(arrayTwo);
		
		System.out.println("First sort: "+Arrays.toString(arrayOne));
		System.out.println("Second sort: "+Arrays.toString(arrayTwo));
		
		int[] arrayInd = new int[secCount]; 
		for (int i = 0; i < arrayTwo.length; i++) {
			int value = arrayTwo[i];
			for (int j = 0; j < arrayOne.length; j++) {
				if(value > arrayOne[j]) {
					arrayInd[i] = j+1;
				}
			}
		}
		System.out.println("Index of array: "+Arrays.toString(arrayInd));
		
		int[] resArr = mergeArrays(arrayOne, arrayTwo, arrayInd);
		System.out.println(Arrays.toString(resArr));
	}
	
	public static int[] mergeArrays(int[] arr1, int[] arr2, int[] indices) {
        int n = arr1.length;
        int m = arr2.length;
        int[] mergedArray = new int[n + m]; // Создаем новый массив для объединения arr1 и arr2

        int i = 0; // Индекс элемента в массиве arr1
        int j = 0; // Индекс элемента в массиве arr2

        // Обходим массив indices
        for (int index : indices) {
            // Вставляем элементы из arr1 до нужного индекса
            while (i < n && i < index) {
                mergedArray[i + j] = arr1[i];
                i++;
            }

            // Вставляем элемент из arr2 в нужный индекс
            mergedArray[i + j] = arr2[j];
            j++;
        }

        // Вставляем оставшиеся элементы из arr1 (если такие есть)
        while (i < n) {
            mergedArray[i + j] = arr1[i];
            i++;
        }

        // Вставляем оставшиеся элементы из arr2 (если такие есть)
        while (j < m) {
            mergedArray[i + j] = arr2[j];
            j++;
        }

        return mergedArray;
    }

}
