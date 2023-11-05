package Ex4;

public enum City {
	BREST("Brest"), VITEBSK("Vitebsk"), MOGILEV("Mogilev"), GRODNO("Grodno"), GOMEL("Gomel"), MINSK("Minsk");
	
	String city;

	private City(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
