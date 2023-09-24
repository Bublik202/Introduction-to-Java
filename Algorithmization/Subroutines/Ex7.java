package Subroutines;

public class Ex7 {
	
	/**
	 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9
	 */
	public static void main(String[] args) {
		int[] factorial = new int[9];	
		for (int i = 0; i < factorial.length; i++) {
			factorial[i] = i+1;		
		}
		
		int fact = 1;
		int j = 1;
		for (int i = 0; i < factorial.length; i++) {			
			fact *= j;
			j++;
			if(factorial[i]%2 !=0) {
				System.out.println(factorial[i] +" -> "+ fact);
			}
		}	
	}

}
