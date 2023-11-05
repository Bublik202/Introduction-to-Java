package Ex5;

public class DecimalCounter {
	private int value = 5;
	private int maxValue = 10;
	private int minValue = 0;

	public DecimalCounter() {
		
	}
	
	public DecimalCounter(int value, int maxValue, int minValue) {
		super();
		this.value = value;
		this.maxValue = maxValue;
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public int getMinValue() {
		return minValue;
	}

	public int getValue() {
		return value;
	}	
	
	//Увеличиваю значение
	public void increment() {
        if(value < maxValue) {
            value++;
        }
    }
	
	//УМеньшаю значение
    public void decrement() {
        if(value > minValue) {
            value--;
        }
    }

}
