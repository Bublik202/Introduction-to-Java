package basics.branch;

import java.util.Scanner;

public class Ex1 {
	/**
	 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
	 * и если да, то будет ли он прямоугольным.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input A: ");
		int a = scanner.nextInt();
		System.out.print("Input B: ");
		int b = scanner.nextInt();
		
		if(a+b>=180) {
			System.out.println("It isn't treangle!");
		}else {
			System.out.println("Good job bro it's treangle");
			if( a==90 || b==90 || a+b==90 ){
				System.out.println("rectangular treangle");
			}else {
				System.out.println("he isn't rectangular treangle");
			}
			
		}

	}

}
