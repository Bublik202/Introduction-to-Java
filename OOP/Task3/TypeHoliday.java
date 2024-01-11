package Task3;

public enum TypeHoliday {
	FEDERAL_HOLIDAY("Federal holiday"), NOT_A_PUBLIC_HOLIDAY("Not A Public Holiday"),
	REGIONAL_HOLIDAY("Regional Holiday");
	
	private String type;

	private TypeHoliday(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
