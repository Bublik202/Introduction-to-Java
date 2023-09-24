package basics.line;

import java.util.Scanner;

public class Ex2 {
	/**
	 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
	 * (b+sqrt(pow(b,2)+4ac))/(2*a) - pow(a,3)*c+pow(b, -2)
	 */
	
public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a = ");
			int a = scanner.nextInt();
			System.out.print("Enter b = ");
			int b = scanner.nextInt();
			System.out.print("Enter c = ");
			int c = scanner.nextInt();
			int z =  (int) ((b + Math.sqrt(Math.pow(b, 2)+4*a*c))/2*a
					-Math.pow(a, 3)*c + Math.pow(b, -2));
			System.out.println("z = "+z);
		}
	}

}
