package Ex1;

import java.util.Scanner;

public class Test1Main {

	public static void main(String[] args) {
		Test1 test = new Test1();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input a: ");
		test.setA(scan.nextInt());	
		System.out.print("input b: ");
		test.setB(scan.nextInt());
		
		System.out.println(test);
		
		int sum = test.sum();
		System.out.println("The sum: "+sum);
		
		int max = test.max();
		System.out.println("Max number: "+max);
	}

}
