package OneDimensionalArrays;

public class Ex3 {
	/**
	 * Дан массив действительных чисел, размерность которого N. Подсчитать,
	 * сколько в нем отрицательных, положительных и нулевых элементов
	 */

	public static void main(String[] args) {
		int[] array = new int[10];
		int posCount = 0;
		int negCount = 0;
		int zeroCount = 0;
		int j = -5;
		for (int i = 0; i < array.length; i++) {
			array[i] = j++;
			if(array[i]>0) { 
				posCount++;
			}if (array[i]<0) {
				negCount++;
			}if (array[i]==0) {
				zeroCount++;
			}
			
//			posCount = array[i]>0 ? posCount++
//			                      : posCount;
//			
//			negCount = array[i]<0 ? negCount++
//			                      : negCount;
//			
//			zeroCount = array[i]==0 ? zeroCount++
//                                  : zeroCount;
		}
		System.out.println("In array "+posCount+" positive");
		System.out.println("In array "+negCount+" negative");
		System.out.println("In array "+zeroCount+" zero");

	}

}
