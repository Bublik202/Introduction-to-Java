package basics.line;

import java.util.Scanner;

public class Ex1 {
	/**
	 * Find the value of the function
	 * z = (( a - 3 ) * b / 2 ) + c 
	 */
	public static void main(String[] args) {
		int a, b, c;
		int z;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a = ");
			a = scanner.nextInt();
			System.out.print("Enter b = ");
			b = scanner.nextInt();
			System.out.print("Enter c = ");
			c = scanner.nextInt();
		}
		z = fun(a, b, c);
		System.out.println("(( a - 3 ) * b / 2 ) + c = "+z);

	}
	public static int fun(int a, int b, int c) {	    
	    return (( a - 3 ) * b / 2 ) + c;	    
	}

}
