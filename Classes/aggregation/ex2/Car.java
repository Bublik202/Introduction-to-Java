package aggregation.ex2;

import java.util.Arrays;

public class Car {
	private String nameCar;
	private Wheel[] wheels;
	private Engine engine;
	private boolean fuel;

	public Car(String nameCar, Wheel[] wheels, Engine engine) {
		super();
		this.nameCar = nameCar;
		this.wheels = wheels;
		this.engine = engine;
		this.fuel = false;
	}

	public String getNameCar() {
		return nameCar;
	}

	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}
	
	public boolean isFuel() {
		return fuel;
	}

	public void setFuel(boolean fuel) {
		this.fuel = fuel;
	}

	public void addFuel() {
		setFuel(true);
	}
	
	public void move() {
		if(isFuel()) {
			System.out.println(this.nameCar + " can drive!");
		}else {
			System.out.println(this.nameCar + " can't drive!");
		}
	}

	public void replaceWheel(int count, Wheel wheel) {
		int i = 0;
		if (count < wheels.length) {
			while(i < count) {		
				wheels[i++] = wheel;		
			}
		}	
	}

	@Override
	public String toString() {
		return "NameCar = " + nameCar +
				", Wheel = " + Arrays.toString(wheels) + ", " + 
				", Engine = "+engine + ", fuel = "+ fuel;
	}

}
