package Ex6;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ClockMain {

	public static void main(String[] args) {
		String format = "HH:mm:ss";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			
		try (Scanner scan = new Scanner(System.in)) {
			Clock clock = new Clock(0, 0, 0);	
			
			LocalTime nowTime = clock.getTime();
			System.out.println("Time now is: "+formatter.format(nowTime));
			
			System.out.print("input hours: ");
			int key = scan.nextInt();
			clock.setHours(key);

			System.out.print("input minutes: ");
			key = scan.nextInt();
			clock.setMinutes(key);
			
			System.out.print("input seconds: ");
			key = scan.nextInt();
			clock.setSeconds(key);
			
			System.out.println(clock);
		}
		
	}

}
