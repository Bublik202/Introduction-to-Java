package aggregation.ex4;

public class Client {
	private String name;
	private int passportNumber;
	
	public Client(String name, int passportNumber) {
		super();
		this.name = name;
		this.passportNumber = passportNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client ").append(name)
		.append(", passportNumber -> ").append(passportNumber);
		builder.append("\n");
		return builder.toString();
		
	}

	
	
}
