package Subroutines;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
	
	/**
	 * Вычислить площадь правильного шестиугольника со стороной а,
	 * используя метод вычисления площади треугольника
	 */
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##", 
				DecimalFormatSymbols.getInstance(Locale.US));
		Scanner scan = new Scanner(System.in);
		System.out.print("input size of line: ");
		int a = scan.nextInt();
		double sqTreangle = triangle(a);
		double hexagon = sqTreangle*6;

		System.out.println("square of hexagon: "+ decimalFormat.format(hexagon));
		
//		String str = decimalFormat.format(hexagon);
//		double smth = Double.parseDouble(str); //String -> double
	}
	
	static double triangle(int a) {
		int p = a*3/2;		
		double sqTreangle = Math.sqrt(p*(p-a)*(p-a)*(p-a));
		return sqTreangle;
	}

}
