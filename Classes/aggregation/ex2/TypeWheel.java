package aggregation.ex2;

public enum TypeWheel {
	SUMMER("Summer"), WINTER("Winter");
	
	String year;

	private TypeWheel(String year) {
		this.year = year;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
