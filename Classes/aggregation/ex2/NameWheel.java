package aggregation.ex2;

public enum NameWheel {
	MICHELIN("Michelin"), CONTINENTAL("Continental"), GOODYEAR("Goodyear"), BRIDGESTONE("Bridgestone");
	
	String name;

	private NameWheel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
