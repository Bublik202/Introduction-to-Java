package Ex10;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AirlineBase {
	Airline[] airlines;

	public AirlineBase(int size) {
		super();
		this.airlines = new Airline[size];
	}
	
	public void add(Airline airline, int index) {
		if(index >= 0 && index < airlines.length) {
			airlines[index] = airline;
		}
	}
	
	public Airline[] destinationFlight(String city) {
		Airline[] array = new Airline[airlines.length];
		int i = 0;
		for (Airline airline : airlines) {
			if(city.equalsIgnoreCase(airline.getDestination().getName())) {
				array[i++] = airline;
			}			
		}
		if(array[0] == null ) {
			System.out.println("City " + city + " isn't in our database");
		}
		return Arrays.copyOf(array , i);
	}
	
	public Airline[] weekFlight(String nameWeek) {
		Airline[] array = new Airline[airlines.length];
		int i = 0;
		for (Airline airline : airlines) {
			if(nameWeek.equalsIgnoreCase(airline.getDaysWeek().toString())) {
				array[i++] = airline;
			}
		}
		if(array[0] == null ) {
			System.out.println("there are no flights for this day: "+nameWeek);
		}
		return Arrays.copyOf(array, i);
	}
	
	//первый вариант
	public Airline[] weekTimeFlightFir(String nameWeek, String time) {
		Airline[] array = new Airline[airlines.length];

		time = time.replaceAll("[,:;\\s]+", " ");
		String[] parts = time.split(" ");
		
		int hours = Integer.parseInt(parts[0]);
		int minutes = Integer.parseInt(parts[1]);		
		LocalTime newTime = LocalTime.of(hours, minutes);

		int i = 0;
		for (Airline airline : airlines) {
			if(nameWeek.equalsIgnoreCase(airline.getDaysWeek().toString()) && newTime.isBefore(airline.getDepartureTime())) {
				array[i++] = airline;
			}
		}	
		return Arrays.copyOf(array, i);
	}	
	
	//Второй вариант
	public Airline[] weekTimeFlightSec(String nameWeek, String time) {
		Airline[] array = new Airline[airlines.length];
		
		StringTokenizer tokenizer = new StringTokenizer(time, " ,:");		
		StringBuilder builder = new StringBuilder();
		while (tokenizer.hasMoreTokens()) {
			String str = tokenizer.nextToken();	
			builder.append(str).append(" ");
		}
			
		String[] delSpace = builder.toString().split(" ");		
		int hours = Integer.parseInt(delSpace[0]);
		int minutes = Integer.parseInt(delSpace[1]);	
		LocalTime newTime = LocalTime.of(hours, minutes);	
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH mm");	
//		
//		String text = newTime.format(formatter);		
//		LocalTime resultTime = LocalTime.parse(text, formatter);
		
		int i = 0;
		for (Airline airline : airlines) {
			if(nameWeek.equalsIgnoreCase(airline.getDaysWeek().toString()) && newTime.isBefore(airline.getDepartureTime())) {
				array[i++] = airline;
			}
		}	
		return Arrays.copyOf(array, i);
	}
	
	@Override
	public String toString() {
		System.out.println("AirlineBase: ");
		StringBuilder builder = new StringBuilder("");
		
		for (Airline airLine : airlines) {
			builder.append(airLine).append("\n");				
		}	
		return builder.toString();
	}	

}
