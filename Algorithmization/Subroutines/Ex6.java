package Subroutines;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
	
	/**
	 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
	 */
	public static void main(String[] args) {
		int[] array = arr();
		
		boolean allPairsMutuallySimple = true;
	       for (int i = 0; i < array.length; i += 2) {
	           if (gcd(array[i], array[i + 1]) != 1) {
	               allPairsMutuallySimple = false;
	               break;
	           }
	       }

        if (allPairsMutuallySimple) {
            System.out.println("All pairs are mutually simple.");
        } else {
            System.out.println("No three numbers are mutually prime.");
        }		
		
	}
			
	static int gcd(int p, int q) {		
		if (q == 0 ) 
			return p;
		else
			return gcd(q, p % q); 
	}
	
	public static int[] arr() {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("Data: "+Arrays.toString(array));
		return array;
	}

}
