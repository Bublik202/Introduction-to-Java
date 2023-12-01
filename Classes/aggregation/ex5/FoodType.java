package aggregation.ex5;

public enum FoodType {
	RO("Room only"), BB("Bed & breakfast"), HB("Half board"), FB("Full board"), 
	HB_PLUS("Extended half board"), FB_PLUS("Extended full board"), AL("All inclusive"), UAI("Ultra All inclusive");
	
	String food;

	private FoodType(String food) {
		this.food = food;
	}

	public String getFood() {
		return food;
	}
}
