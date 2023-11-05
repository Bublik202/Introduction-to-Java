package Ex8;

public class Customer {
	private int id;
	private int creditCard;
	private int bankAccount;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	
	public Customer() {
		
	}
	
	public Customer(int id, int creditCard, int bankAccount,
			String surname, String name, String patronymic, String address) {
		super();
		this.id = id;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}

	public int getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", creditCard=" + creditCard + ", bankAccount=" + bankAccount + ", surname="
				+ surname + ", name=" + name + ", patronymic=" + patronymic + ", address=" + address + "]";
	}	
	
}
