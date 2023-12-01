	package aggregation.ex5;

import java.time.LocalDate;
import java.util.Objects;

public class Voucher {
	private CountryType countryType;
	private String city;
	private VoucherType voucherType;
	private TransportType transportType;
	private FoodType foodType;
	private LocalDate fromDate;
	private LocalDate toDate;
	private int days;
	
	public Voucher(CountryType countryType, String city, VoucherType voucherType, TransportType transportType,
			FoodType foodType, LocalDate fromDate, LocalDate toDate, int days) {
		super();
		this.countryType = countryType;
		this.city = city;
		this.voucherType = voucherType;
		this.transportType = transportType;
		this.foodType = foodType;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.days = days;
	}

	public CountryType getCountryType() {
		return countryType;
	}

	public void setCountryType(CountryType countryType) {
		this.countryType = countryType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public VoucherType getVoucherType() {
		return voucherType;
	}

	public void setVoucherType(VoucherType voucherType) {
		this.voucherType = voucherType;
	}

	public TransportType getTransportType() {
		return transportType;
	}

	public void setTransportType(TransportType transportType) {
		this.transportType = transportType;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, countryType, days, foodType, fromDate, toDate, transportType, voucherType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voucher other = (Voucher) obj;
		return Objects.equals(city, other.city) && countryType == other.countryType && days == other.days
				&& foodType == other.foodType && Objects.equals(fromDate, other.fromDate)
				&& Objects.equals(toDate, other.toDate) && transportType == other.transportType
				&& voucherType == other.voucherType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Voucher \nCountry: ").append(countryType.getStr())
		.append("\nCity: ").append(city)
		.append("\nvoucher type: ").append(voucherType.name())
		.append("\ntransport: ").append(transportType.getTransport())
		.append("\nfood: ").append(foodType.getFood())
		.append("\nfrom: ").append(fromDate).append(" to: ").append(toDate)
		.append("\ndays: ").append(days).append("\n");
		return builder.toString();
	}

}
