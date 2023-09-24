package basics.line;

import java.util.Scanner;

public class Ex3 {
	/**
	 *  Вычислить значение выражения по формуле (все переменные принимают действительные значения):
	 *  (sin(x) + cos(y))/(cos(x)-sin(y))*tg(x*y)
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter x = ");
		double x = scanner.nextDouble();
	    System.out.print("Enter y = ");
		double y = scanner.nextDouble();
		double z = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
//		System.out.print("z ="+z);
	    System.out.println("z ="+" "+scale(z));

	}
	public static double scale(double point) {	
		double scale = Math.pow(10, 3);
		double z = Math.ceil(point * scale) / scale;

		return z;

	}
}
