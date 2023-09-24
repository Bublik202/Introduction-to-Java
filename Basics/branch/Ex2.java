package basics.branch;

import java.util.Scanner;

public class Ex2 {
	/**
	 * Найти max{min(a, b), min(c, d)}
	 */

	private static Scanner scanner;

	public static void main(String[] args) {		
		System.out.print("Input a: ");
		int a = input();
		System.out.print("Input b: ");
		int b = input();			
		System.out.print("Input c: ");
		int c = input();
		System.out.print("Input d: ");
		int d = input();		
		
		System.out.println("Max: " +max(min(a, b), min(c, d)));

	}
	
    public static int min(int x, int y) {
//    	if(x<y) {
//    		return x;
//        }
//    	return y;
    	return x < y ? x : y;
    }
    
    public static int max(int x, int y) {
    	return x > y ? x : y;
    }
    
    public static int input() {
    	scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		return x;
	}
    
}
