package Ex5;

public class DecimalCounterMain {

	public static void main(String[] args) {
		DecimalCounter counter = new DecimalCounter();		
		System.out.print("Default: value -> " + counter.getValue());
		System.out.print(" Max -> "+counter.getMaxValue());
		System.out.print(" Min -> "+counter.getMinValue() + "\n");
		
		counter.increment();
		System.out.println("Value + 1 -> " + counter.getValue()+" ");	
		counter.decrement();
		counter.decrement();
		System.out.println("Value - 2 -> " + counter.getValue()+" \n");
		
		counter = new DecimalCounter(10, 20, 5);
		System.out.println("Person value -> " + counter.getValue()+" ");		
		System.out.println("Default Max Value -> "+counter.getMaxValue());
		System.out.println("Default Min Value -> "+counter.getMinValue());
		
		counter.increment();
		System.out.println("Value + 1 -> " + counter.getValue()+" ");	
		counter.decrement();
		counter.decrement();
		System.out.println("Value - 2 -> " + counter.getValue()+" \n");
		
		System.out.println("Now value -> " + counter.getValue()+" ");	
		
		int x = counter.getMaxValue();		
		System.out.print("Min: " + counter.getMinValue() + 
				", now value " + counter.getValue() + " - " + x + " -> ");
		
		for (int i = 0; i < x; i++) {
			counter.decrement();
		}		
		System.out.print(counter.getValue()+" This value doesn't exceed the minimum value.");
		
		int y = counter.getMaxValue();		
		System.out.print("\nMax: " + counter.getMaxValue() + 
				", now value " + counter.getValue() + " + " + y + " -> ");
		
		for (int i = 0; i < x; i++) {
			counter.increment();
		}		
		System.out.print(counter.getValue()+" This value doesn't exceed the maximum value.");
		
		
		
		
			
		
		

	}

}
