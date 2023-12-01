package aggregation.ex4;

import java.util.Objects;

public class Bill {
	private String numberOfBill;
	private int money;
	private boolean status;
	private int passportNumber;

	public Bill() {
	}
	
	public Bill(String numberOfBill, int money, boolean status, int passportNumber) {
		super();
		this.numberOfBill = numberOfBill;
		this.money = money;
		this.status = status;
		this.passportNumber = passportNumber;
	}

	public String getNumberOfBill() {
		return numberOfBill;
	}

	public void setNumberOfBill(String numberOfBill) {
		this.numberOfBill = numberOfBill;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public int getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(money, numberOfBill, passportNumber, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bill other = (Bill) obj;
		return money == other.money && Objects.equals(numberOfBill, other.numberOfBill)
				&& passportNumber == other.passportNumber && status == other.status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bill -> NumberOfBill = ").append(numberOfBill).append(", money -> ").append(money).append("$, ")
		.append("status = ").append(status).append(", passportNumber = ").append(passportNumber);
		return builder.toString();
		
	}

}
