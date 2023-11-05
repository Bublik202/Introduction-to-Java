package Ex4;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Train implements Comparable<Train>, Comparator<Train>{
	
	private City City;		
	private String destination;
	private int numberTrain;
	private LocalTime time;

	public Train(String destination, int numberTrain, LocalTime time) {
		super();
		this.destination = destination;
		this.numberTrain = numberTrain;
		this.time = time;	
	}

	public Train() {
		super();		
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberTrain() {
		return numberTrain;
	}

	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}	
	
	@Override
	public String toString() {
		return "Train [destination = " + destination + ", number = " + numberTrain + ", time = " + time + "]";
	}	
	
	public Train create(int key) {
		Train train = null;
		LocalTime time = null;		
		
		switch (key) {
		case 16:
			time = LocalTime.of(14, 30);			
			train = new Train(City.BREST.city + " - " + City.VITEBSK.city, key, time);
			break;
		case 22:
			time = LocalTime.of(14, 45);
			train = new Train(City.MINSK.city + " - " + City.BREST.city, key, time);
			break;
		case 30:
			time = LocalTime.of(15, 00);
			train = new Train(City.GOMEL.city + " - " + City.MINSK.city, key, time);
			break;
		case 26:
			time = LocalTime.of(15, 15);
			train = new Train(City.GOMEL.city + " - " + City.MINSK.city, key, time);
			break;
		case 14:
			time = LocalTime.of(15, 30);
			train = new Train(City.GRODNO.city + " - " + City.VITEBSK.city, key, time);
			break;	
		default:
			System.out.println("wrong number!");
		}		
		return train;
	}
	
	public void inputTrain(Train[] array) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Input number of train [16, 22, 30, 26, 14] -> ");
			int key = scan.nextInt();
			
			for (Train train : array) {
				if(train.getNumberTrain() == key) {
					System.out.println(train);
				}
			}
		}
	}

	//сортировка городов и времени с помощью Comparable
	@Override
	public int compareTo(Train o) {
		int result = this.destination.compareTo(o.destination);
		return result !=0 ? result :this.time.compareTo(o.time);
	}

	//сортировка номеров поездов с помощью Comparator
	@Override
	public int compare(Train o1, Train o2) {				
		return o1.numberTrain - o2.numberTrain;
	}

}
