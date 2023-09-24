package Subroutines;

import java.util.Scanner;

public class Ex13 {
	
	/**
	 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 
	 * (например, 41 и 43). 
	 * Найти и напечатать все пары «близнецов» из отрезка [n,2n],
	 * где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = scan.nextInt();
		System.out.println("primes from "+ n +" to "+ n*2 +" are found");
        result(n);
    }
	
	static boolean check(int num) {
		if(num <= 1) {
			return false;
		}
		
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
	            return false;
	        }
		}		
		return true;
	}
	
	static void result(int n) {
		for (int num = n; num <= n*2; num++) {
			if(num == n*2-1) {
				break;
			}
            if (check(num) && check(num+2)) {
                System.out.println("(" + num + ", " + (num + 2) + ")");
            }
        }
		
	}

}
