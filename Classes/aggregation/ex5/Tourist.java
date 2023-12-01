package aggregation.ex5;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;

public class Tourist {
	private Voucher[] vouchers;
	
	public Tourist() {
	}

	public Voucher[] getVouchers() {
		return vouchers;
	}

	public void setVouchers(Voucher[] vouchers) {
		this.vouchers = vouchers;
	}
	
	public void init() {
		Voucher voucher_1 = new Voucher(CountryType.CA, "Vancouver", VoucherType.NEW_YEAR, TransportType.AVIATION, FoodType.AL, 
				LocalDate.of(2022, Month.DECEMBER, 23), LocalDate.of(2023, Month.JANUARY, 10),  18);
		
		Voucher voucher_2 = new Voucher(CountryType.US, "New York", VoucherType.NEW_YEAR, TransportType.AVIATION, FoodType.UAI, 
				LocalDate.of(2022, Month.DECEMBER, 20), LocalDate.of(2023, Month.JANUARY, 10),  21);
		
		Voucher voucher_3 = new Voucher(CountryType.EG, "Cairo", VoucherType.EXCURSIONS, TransportType.BUS, FoodType.AL, 
				LocalDate.of(2023, Month.JULY, 1), LocalDate.of(2023, Month.JULY, 30),  29);
		
		Voucher voucher_4 = new Voucher(CountryType.CY, "Nicosia", VoucherType.CRUISES, TransportType.MOTOR_SHIP, FoodType.FB_PLUS, 
				LocalDate.of(2023, Month.MAY, 10), LocalDate.of(2023, Month.JUNE, 28),  49);
		
		Voucher voucher_5 = new Voucher(CountryType.GE, "Racha-Lechkhumi", VoucherType.SKI, TransportType.COMBINED, FoodType.RO, 
				LocalDate.of(2023, Month.JANUARY, 15), LocalDate.of(2023, Month.MARCH, 20),  64);
		
		Voucher voucher_6 = new Voucher(CountryType.UA, "Yevpatoria", VoucherType.TREATMENT, TransportType.RAILWAY, FoodType.FB_PLUS, 
				LocalDate.of(2023, Month.SEPTEMBER, 2), LocalDate.of(2023, Month.SEPTEMBER, 20),  18);
		
		Voucher voucher_7 = new Voucher(CountryType.CA, "Calgary", VoucherType.NEW_YEAR, TransportType.AVIATION, FoodType.FB, 
				LocalDate.of(2022, Month.DECEMBER, 20), LocalDate.of(2023, Month.JANUARY, 8),  19);
		
		Voucher voucher_8 = new Voucher(CountryType.US, "Washington", VoucherType.NEW_YEAR, TransportType.AVIATION, FoodType.HB, 
				LocalDate.of(2022, Month.DECEMBER, 20), LocalDate.of(2023, Month.JANUARY, 10),  21);
		
		Voucher voucher_9 = new Voucher(CountryType.EG, "Hurghada", VoucherType.EXCURSIONS, TransportType.MOTOR_SHIP, FoodType.BB, 
				LocalDate.of(2023, Month.JULY, 10), LocalDate.of(2023, Month.JULY, 20),  10);
		
		Voucher voucher_10 = new Voucher(CountryType.IT, "Napoli", VoucherType.CRUISES, TransportType.COMBINED, FoodType.FB_PLUS, 
				LocalDate.of(2023, Month.MAY, 10), LocalDate.of(2023, Month.JUNE, 28),  49);
		
		Voucher voucher_11 = new Voucher(CountryType.CN, "Shanghai", VoucherType.CRUISES, TransportType.BUS, FoodType.AL, 
				LocalDate.of(2023, Month.AUGUST, 15), LocalDate.of(2023, Month.SEPTEMBER, 3),  19);
		
		Voucher voucher_12 = new Voucher(CountryType.UA, "Odessa", VoucherType.TREATMENT, TransportType.RAILWAY, FoodType.HB_PLUS, 
				LocalDate.of(2023, Month.JUNE, 23), LocalDate.of(2023, Month.JULY, 20),  27);
		
		Voucher voucher_13 = (new Voucher(CountryType.US, "New-Yourk", VoucherType.NEW_YEAR,
				TransportType.AVIATION, FoodType.AL, LocalDate.of(2023, Month.NOVEMBER, 30), LocalDate.of(24, 01, 10), 41));
		
		setVouchers(new Voucher[]{voucher_1, voucher_2, voucher_3, voucher_4, voucher_5, voucher_6,
				voucher_7, voucher_8, voucher_9, voucher_10, voucher_11, voucher_12, voucher_13});
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Voucher voucher : vouchers) {
			builder.append(voucher);
		}
		builder.append("\n");
		return builder.toString();
	}
	
	public void sort() {
		Arrays.sort(vouchers, new Comparator<Voucher>() {

			@Override
			public int compare(Voucher o1, Voucher o2) {
				return o1.getDays() - o2.getDays();
			}
		});
	}
	
	//Путевки в страну
	public void selectCounty(String country) {
		System.out.println("Vouchers in -> "+country);
		for (Voucher voucher : vouchers) {
			if(voucher.getCountryType().getStr().equalsIgnoreCase(country)) {
				System.out.println(voucher);
			}
		}
	}
	
	//Путевки на определенном виде транспорта
	public void selectTransport(String transport) {
		System.out.println("Vouchers on this transport -> "+transport);
		for (Voucher voucher : vouchers) {
			if(voucher.getTransportType().getTransport().equalsIgnoreCase(transport)) {
				System.out.println(voucher);
			}
		}
	}
	
	//Путевки от и до кол-во дней
	public void selectCountDays(int from, int to){
		System.out.println("Vouchers from "+from+" days, to "+to);
		for (Voucher voucher : vouchers) {
			if(voucher.getDays() > from && voucher.getDays() < to) {
				System.out.println(voucher);
			}
		}
	}

	//Путевки в определенный город 
	public void selectCity(String city) {
		System.out.println("Vouchers in this city: "+city);
		for (Voucher voucher : vouchers) {
			if(voucher.getCity().equalsIgnoreCase(city)) {
				System.out.println(voucher);
			}
		}
	}
	
}
