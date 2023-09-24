package OneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
	/**
	 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
     * чисел несколько, то определить наименьшее из них
	 */

	public static void main(String[] args) {
		int[] array = arr();
		/*resNum: итоговое число 
		 * resCount итоговое кол-во чисел
		 * count проверяем с resCout на большее
		 */
		int resNum = 0;
		int resCount = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {		
            for (int j = 0; j < array.length; j++) {            	
                if(array[j] == array[i]) {
                	count++;               	
                }
                if(resCount<count) {
                	resCount = count;
                	resNum = array[i];
                }       
            }
            if(resCount==count) {
            	if(array[i]<resNum){
            		resNum = array[i];
            	}
            }
            count = 0;
		}
         System.out.println(resNum);             
	}

	public static int[] arr() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("input size of array: ");
			int n = scan.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = (int)(Math.random()*2)-2;
			}
			System.out.println("Data: "+Arrays.toString(array));
			return array;
		}
	}

}
