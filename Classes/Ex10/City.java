package Ex10;

public enum City {
	WASHINGTON("Washington"), LONDON("London"), WARSAW("Warsaw"), PARIS("Paris");
	
	private String name;

	private City(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
