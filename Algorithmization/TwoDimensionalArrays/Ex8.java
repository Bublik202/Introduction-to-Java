package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
	/* В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
	 * на соответствующие им позиции другого, а его элементы второго переместить в первый. 
	 * Номера столбцов вводит пользователь с клавиатуры.
	 */

	public static void main(String[] args) {
		System.out.print("input array string: ");
		int a = number();
		System.out.print("input array columns: ");
		int b = number();		
		System.out.print("input first columns: ");
		int fir = number();
		System.out.print("input second columns: ");
		int sec = number();

		int[][] array = new int[a][b];
		int value = 1;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				array[i][j] = value++;			
			}
		}
		System.out.print("\nData: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
		for (int i = 0; i < a; i++) {
			int x = array[i][fir];
			array[i][fir] = array[i][sec];
		    array[i][sec] = x;						
		}	
		System.out.print("\nResult: \n");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}		
	}
	public static int number() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		return x;
	}
	
}






