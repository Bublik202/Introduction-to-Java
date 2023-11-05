package Ex10;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Airline {
	private City destination;
	private int flightNumber;
	private String aircraftType;
	private LocalTime departureTime;
	private DayOfWeek daysWeek;
	
	public Airline(City destination, int flightNumber, String aircraftType, LocalTime departureTime,
			DayOfWeek daysWeek) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.daysWeek = daysWeek;
	}

	public City getDestination() {
		return destination;
	}

	public void setDestination(City destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public DayOfWeek getDaysWeek() {
		return daysWeek;
	}

	public void setDaysWeek(DayOfWeek daysWeek) {
		this.daysWeek = daysWeek;
	}
	
	public String getFormattedDayOfWeek() {
	    String dayOfWeek = daysWeek.toString();
	    return dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1).toLowerCase();
	}

	@Override	
	public String toString() {
		return "Airline [destination=" + destination.getName() + ", flightNumber=" + flightNumber + ", aircraftType="
				+ aircraftType + ", departureTime=" + departureTime + ", daysWeek=" + getFormattedDayOfWeek() + "]";
	}

}
