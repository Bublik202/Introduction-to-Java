package OneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
	/**
	 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
	 * 
	 */

	public static void main(String[] args) {			
		int[] array = arr();
		int indexMax = 0;
		int indexMin = 0;
		int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
        	if(array[i]>max) {
        		max = array[i];
        		indexMax = i;
        	}   
        	
        	if(array[i]<min) {
        		min = array[i];
        		indexMin = i;
        	}
        	
        }     
        System.out.println("The max number: "+max);
        System.out.println("The min number: "+min);
          
        array[indexMin] = max;
        array[indexMax] = min;
        System.out.println(Arrays.toString(array));
	}
	
	public static int[] arr() {
		Scanner scan = new Scanner(System.in);
		System.out.print("input size of array");
		int n = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*30)-10;
		}
		System.out.println("Data: "+Arrays.toString(array));
		return array;
	}

}
