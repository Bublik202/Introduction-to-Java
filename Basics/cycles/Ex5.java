package basics.cycles;

import java.util.Scanner;

public class Ex5 {
	/**
	 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
	 * заданному е. Общий член ряда имеет вид an=1/2^n+1/3^ns
	 */

	public static void main(String[] args) {
		double sum = 0;
        double a = 0;
       
        Scanner scanner = new Scanner(System.in); {
        	System.out.print("input e: ");
        	double e = scanner.nextDouble();
        	
        	for(int i = 1; i <= 100; i++) {
        		a =(1 / Math.pow(2, i) + 1 / Math.pow(3, i));
        		if(Math.abs(a) >= e) {
        			sum += a;
        			System.out.println(a+" the sum: "+sum);
        		}
        	}
			
		 }
		 
		 System.out.println();

	}

}
