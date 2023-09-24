package basics.branch;

import java.util.Scanner;

public class Ex5 {
	/**
	 * Вычислить значение функции: F(x) = pow(x, 2)-3x+9, если x<=3; = 1/((pow(x,3)+6), x>3
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("input x: ");
		double x = scanner.nextInt();
		double f=0;
		if(x<=3) {
			f = Math.pow(x, 2)-(3 * x)+9;		
		}else {
			f =  1/(Math.pow(x, 3)+6);
		}
		System.out.println("F(x)= " +scale(f));

	}
	public static double scale(double point) {
		double scale = Math.pow(10, 3);
		double result = Math.ceil(point * scale) / scale;
		return result;

	}
    
}
