package aggregation.ex2;

public class Main {

	public static void main(String[] args) {
		Car car_1 = new Car("Ferrari", 
				new Wheel(TypeWheel.SUMMER, NameWheel.MICHELIN).create(), 
				new Engine(8.5, 8));
		
		Car car_2 = new Car("Lamborgini", 
				new Wheel(TypeWheel.WINTER, NameWheel.BRIDGESTONE).create(), 
				new Engine(12, 10));
		
		Car car_3 = new Car("Audi", 
				new Wheel(TypeWheel.WINTER, NameWheel.GOODYEAR).create(), 
				new Engine(4.0, 6));
				
		System.out.println("Car base: ");
		Car[] car = {car_1, car_2, car_3};
		for (Car newCar : car) {
			System.out.println(newCar);
		}
		
		System.out.println("\nWhich car can drive: ");
		car_1.addFuel();
		car_3.addFuel();
		
		for (Car carFuel : car) {
			carFuel.move();			
		}	
		System.out.println("\nReplace Wheel: ");	
		car_2.replaceWheel(2, new Wheel(TypeWheel.WINTER, NameWheel.GOODYEAR));	
		car_3.replaceWheel(4, new Wheel(TypeWheel.SUMMER, NameWheel.MICHELIN));
		for (Car carRep : car) {
			System.out.println(carRep);
		}

	}

}
