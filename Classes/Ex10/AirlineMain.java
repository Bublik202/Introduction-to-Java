package Ex10;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Scanner;

public class AirlineMain {

	public static void main(String[] args) {
		AirlineBase base = new AirlineBase(7);
		
		base.add(new Airline(City.WASHINGTON, 14, "Boeing_747", LocalTime.of(16, 30), DayOfWeek.MONDAY), 0);
		base.add(new Airline(City.LONDON, 22, "Airbus_A320", LocalTime.of(16, 45), DayOfWeek.FRIDAY), 1);
		base.add(new Airline(City.WARSAW, 29, "Cessna_172", LocalTime.of(15, 30), DayOfWeek.FRIDAY), 2);
		base.add(new Airline(City.WASHINGTON, 8, "Embraer_E175", LocalTime.of(13, 20), DayOfWeek.THURSDAY), 3);
		base.add(new Airline(City.PARIS, 42, "McDonnell_Douglas_MD-80", LocalTime.of(15, 55), DayOfWeek.FRIDAY), 4);
		base.add(new Airline(City.WARSAW, 31, "Bombardier_CRJ200", LocalTime.of(9, 55), DayOfWeek.SATURDAY), 5);
		base.add(new Airline(City.PARIS, 16, "Lockheed_C-130_Hercules", LocalTime.of(11, 42), DayOfWeek.MONDAY), 6);

		System.out.println(base);
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Input destination: ");
			String city = scan.nextLine();
			
			Airline[] array = base.destinationFlight(city);
			for (Airline airline : array) {
				System.out.println(airline);
			}
			
			System.out.print("\nInput day of week: ");
			String nameWeek = scan.nextLine();
			Airline[] arrayWeek = base.weekFlight(nameWeek);
			for (Airline airline : arrayWeek) {
				System.out.println(airline);
			}
			
			System.out.print("\nInput day of week: ");
			String week = scan.nextLine();
			System.out.print("Input day of time: ");
			String time = scan.nextLine();
			
			Airline[] arrayWeekTime = base.weekTimeFlightSec(week, time);
			for (Airline airline : arrayWeekTime) {
				System.out.println(airline);
			}
		}
		
	}

}
