package basics.line;

import java.util.Scanner;

public class Ex6 {
	/**
	 * Для данной области составить линейную программу, которая печатает true,
	 * если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
	 */

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("input x: ");
			int x = scanner.nextInt();
			System.out.print("input y: ");
			int y = scanner.nextInt();
			
			System.out.println(function(x,y));
				
		}
	}
	
	public static boolean function (int x, int y) {		
		return (x <= 2 && y <= 4 || x <= 4 && y <= -3 ||
				x <= -4 && y <= -3 || x <= -2 && y <= 4) 
			? true
			: false;		
	}
	
	public static boolean functionX (int x, int y) {
		if(x <= 2 && y <= 4 || x <= 4 && y <= -3) {
			return true;
		}
		if(x <= -4 && y <= -3 || x <= -2 && y <= 4) {
			return true;
		}
		return false;		
	}
	
	

}
