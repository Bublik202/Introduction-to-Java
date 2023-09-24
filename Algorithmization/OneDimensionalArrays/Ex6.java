package OneDimensionalArrays;

public class Ex6 {
	/**
	 * Задана последовательность N вещественных чисел. Вычислить сумму чисел,
	 * порядковые номера которых являются простыми числами.
	 */

	public static void main(String[] args) {
		int[] array = {5, 4, 8, 9, 11, 13, 6, 7, 19, 23, 34, 54};
		int count = 0;
		for (int i = 2; i < array.length; i++) {
			for (int j = 2; j < i; j++) {
				 if(i % j ==0 ) {
					 count++;			
				 }
			}
			if(count==0)
				 System.out.print(array[i]+" ");
			if(count>0) {
			count = 0;	
			}
		}		
		
	}

}
