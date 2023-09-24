package SortArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex8 {
	
	/**
	 * даны дроби p1/q1, p2/q2, ... , pn/qn
	 * (pi qi, - натуральные). Составить программу, которая приводит эти дроби к общему
	 * знаменателю и упорядочивает их в порядке возрастания.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input number of fractions: ");
		int n = scan.nextInt();
		if(n % 2 != 0) {
			n++;
		}		
		Random random = new Random();
		
		int[] arrP = new int[n];
		for (int i = 0; i < n; i++) {
			arrP[i] = random.nextInt(1, 21);
		}
		int[] arrQ = new int[n]; 
		for (int i = 0; i < n; i++) {
			arrQ[i] = random.nextInt(1, 21);
		}

 		System.out.println("Data: "+Arrays.toString(arrP));
		System.out.println("Data: "+Arrays.toString(arrQ));
		
		//НОК и НОД нахожу здесь
		int[] lcm = new int[n];
		for (int i = 0; i < lcm.length-1; i+=2) {
			int gcdValue = Fraction.gcd(arrQ[i], arrQ[i+1]);
			lcm[i] = Fraction.lcm(arrQ[i], arrQ[i+1], gcdValue);			
		}
		
		//Дополнительный множитель в 2 дробях 
		int[] addMult = new int[n];		
		for (int i = 0; i < lcm.length-1; i+=2) {
			int[] temp = new int[2];
			temp = Fraction.addMult(arrQ[i], arrQ[i+1], lcm[i]);
			System.arraycopy(temp, 0, addMult, i, 2); 
		}
		
		int[] multy = new int[n*2];
		int j = 0;
		for (int i = 0; i < n; i++) {
			int[] temp = new int[2];			
			temp = Fraction.multiply(arrP[i], arrQ[i], addMult[i]);
			System.arraycopy(temp, 0, multy, j, 2);
			j+=2;
		}
		
		System.out.println("\nreduced fractions to a common denominator: ");
		
		j=0;
		for (int i = 0; i < multy.length; i+=2) {			
			System.out.print(multy[i]+"/"+multy[i+1]);
			j++;
			if(i != multy.length-1 &&  j % 2 != 0) {
				System.out.print(" and ");				
			}else {
				System.out.print("\n");
			}
		}
		
    }	 	

}







