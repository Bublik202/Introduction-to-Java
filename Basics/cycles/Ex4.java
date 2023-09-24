package basics.cycles;

import java.math.BigDecimal;

public class Ex4 {
	/**
	 * Составить программу нахождения произведения квадратов первых двухсот чисел.
	 */

	public static void main(String[] args) {
		
		  long sum = 1;
//        int i = 0;
//        double number = 1;
//
//        while (i <= 200) {
//            sum *= number * number;
//            number++;
//            i++;
//        }
//
//        System.out.println((sum));
		
		BigDecimal decimal = new BigDecimal(1);
        for (int j = 1; j <= 200; j++) {
        	BigDecimal kvadr = new BigDecimal(j * j);
        	decimal = decimal.multiply(kvadr);			
		}
        System.out.println((decimal));
        
      
	}
	
	
}
