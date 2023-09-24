package basics.cycles;

import java.util.Scanner;

public class Ex7 {
	/**
	 * Для каждого натурального числа в промежутке от m до n вывести все делители,
	 * кроме единицы и самого числа m и n вводятся с клавиатуры.
	 */

	public static void main(String[] args) {
		int m;
		int n;
		do {
			Scanner scanner = new Scanner(System.in); {
				System.out.print("input m: ");
				m = scanner.nextInt();
				System.out.print("input n: ");
				n = scanner.nextInt();
				
				if(n < m || m < 1) {
					System.out.println("please write natural number: ");					
				}
			}
		}while(n<=m);
		
		for (int i = m; i <= n; i++) {	
			boolean isNumber = true;
			for (int j = 2; j < i; j++) {				
				if(i % j == 0) {
					if(isNumber) {
						System.out.print("\nnumber: " + i + " its divisors: ");
						isNumber = false;
					}		       				       		
		       		System.out.print(j+" ");
				}
			}	
		}
		
	}

}
