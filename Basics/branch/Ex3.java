package basics.branch;

import java.util.Scanner;

public class Ex3 {
	/**
	 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
	 */

	public static void main(String[] args) {
		System.out.print("Input x1: ");
		int x1 = input();
		System.out.print("Input y1: ");
		int y1 = input();			
		System.out.print("Input x2: ");
		int x2 = input();
		System.out.print("Input y2: ");
		int y2 = input();
		System.out.print("Input x3: ");
		int x3 = input();
		System.out.print("Input y3: ");
		int y3 = input();
		
		if((x3-x2)/(x1-x2)==(y3-y2)/(y1-y2)) {
			System.out.println("that's line");
		}else {
			System.out.println("that's not line");
		}
		
	}

	
	public static int input() {
    	Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		return x;
	}
	
}