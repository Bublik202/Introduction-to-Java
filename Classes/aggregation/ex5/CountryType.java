package aggregation.ex5;

public enum CountryType {
	BY("Belarus"), BE("Belgium"), BG("Bulgaria"), DO("Dominican Republic"), EG("Egypt"), IN("India"),
	ES("Spain"), IT("Italy"), CY("Cyprus"), CN("China"), LT("Lithuania"), AE("United Arab Emirates"),
	PL("Poland"), GB("United Kingdom"), US("United States"), TR("Turkey"), UA("Ukraine"), FR("France"),
	CA("Canada"), DE("Germany"), GE("Georgia");
	
	String str;

	private CountryType(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}	
	
}
