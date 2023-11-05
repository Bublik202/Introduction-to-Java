package Ex4;

import java.util.Arrays;

public class TrainMain {

	public static void main(String[] args) {		
		Train[] trains = new Train[5];	
		create(trains);
		
		//Вывожу информацию о поезде
		Train inTrain = new Train();
		inTrain.inputTrain(trains);
		
		//Сортирую по городам и времени
		System.out.println("\nSorting destination and time: ");
		Arrays.sort(trains);		
		for (Train train : trains) {
			System.out.println(train);
		}
		
		//Сортирую по номерам поездов
		System.out.println("\nSorting numberTrain: ");		
		Arrays.sort(trains, new Train());
		for (Train train : trains) {
			System.out.println(train);
		}			
	}
	
	public static void create(Train[] trains) {
		Train train = new Train();
		int number[] = {16, 22, 30, 26, 14};
		
		for (int i = 0; i < trains.length; i++) {
			trains[i] = train.create(number[i]);
			
		}		
	}

}
