package Task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Calendar {
	private Holiday[] holidays;
	
	public Calendar() {
		
	}
	
	class Holiday{		
		private LocalDate date;
		private String holidayName;
		private TypeHoliday typeHoliday;
		
		public Holiday(LocalDate date, String holidayName, TypeHoliday typeHoliday) {
			super();
			this.date = date;
			this.holidayName = holidayName;
			this.typeHoliday = typeHoliday;
		}
		
		public Holiday() {
		}

		public LocalDate getDate() {
			return date;
		}
		public String getHolidayName() {
			return holidayName;
		}
		public TypeHoliday getTypeHoliday() {
			return typeHoliday;
		}			
		
	}
	
	public void initData() {
		Holiday jan_01 = new Holiday(LocalDate.of(2024, 1, 1), "New Year's Day", TypeHoliday.FEDERAL_HOLIDAY);
		Holiday jan_02 = new Holiday(LocalDate.of(2024, 1, 2), "New Year's Day (in lieu)", TypeHoliday.FEDERAL_HOLIDAY);
		Holiday jan_16 = new Holiday(LocalDate.of(2024, 1, 16), "Martin Luther King Jr. Day", TypeHoliday.FEDERAL_HOLIDAY);			
		Holiday feb_20 = new Holiday(LocalDate.of(2024, 2, 20), "President's Day", TypeHoliday.FEDERAL_HOLIDAY);
		
		Holiday apr_09 = new Holiday(LocalDate.of(2024, 4, 9), "Easter Sunday", TypeHoliday.NOT_A_PUBLIC_HOLIDAY);
		Holiday may_14 = new Holiday(LocalDate.of(2024, 5, 14), "Mother's Day", TypeHoliday.NOT_A_PUBLIC_HOLIDAY);
		Holiday may_29 = new Holiday(LocalDate.of(2024, 5, 29), "Memorial Day", TypeHoliday.FEDERAL_HOLIDAY);
		
		Holiday jun_18 = new Holiday(LocalDate.of(2024, 6, 18), "Father's Day", TypeHoliday.NOT_A_PUBLIC_HOLIDAY);
		Holiday jun_19 = new Holiday(LocalDate.of(2024, 6, 19), "Juneteenth", TypeHoliday.FEDERAL_HOLIDAY);
		Holiday jun_19_2 = new Holiday(LocalDate.of(2024, 6, 19), "Juneteenth (in lieu)", TypeHoliday.FEDERAL_HOLIDAY);
		Holiday jul_04 = new Holiday(LocalDate.of(2024, 7, 4), "Independece Day", TypeHoliday.FEDERAL_HOLIDAY);
		
		Holiday sep_04 = new Holiday(LocalDate.of(2024, 9, 4),"Labor Day", TypeHoliday.FEDERAL_HOLIDAY);
		Holiday oct_02 = new Holiday(LocalDate.of(2024, 10, 2), "Cabrini Day", TypeHoliday.REGIONAL_HOLIDAY);
		Holiday oct_09 = new Holiday(LocalDate.of(2024, 10, 9), "Columbus Day", TypeHoliday.FEDERAL_HOLIDAY);
		Holiday oct_09_2 = new Holiday(LocalDate.of(2024, 10, 9), "US Indigenous People's Day", TypeHoliday.REGIONAL_HOLIDAY);
		Holiday nov_10 = new Holiday(LocalDate.of(2024, 11, 10), "Veterans Day", TypeHoliday.FEDERAL_HOLIDAY);
		Holiday nov_11 = new Holiday(LocalDate.of(2024, 11, 11), "Veterans Day", TypeHoliday.FEDERAL_HOLIDAY);
		Holiday nov_23 = new Holiday(LocalDate.of(2024, 11, 23), "Thanksgiving", TypeHoliday.FEDERAL_HOLIDAY);
		Holiday nov_24 = new Holiday(LocalDate.of(2024, 11, 24), "day after Thanksgiving", TypeHoliday.REGIONAL_HOLIDAY);
		Holiday dec_25 = new Holiday(LocalDate.of(2024, 12, 25), "Christmas Day", TypeHoliday.FEDERAL_HOLIDAY);
		Holiday dec_27 = new Holiday(LocalDate.of(2024, 12, 27), "Christmas Holiday", TypeHoliday.REGIONAL_HOLIDAY);
		
		holidays = new Holiday[] {jan_01, jan_02, jan_16, feb_20, apr_09, may_14, may_29, jun_18, jun_19, jun_19_2,
			jul_04, sep_04, oct_02, oct_09, oct_09_2, nov_10, nov_11, nov_23, nov_24, dec_25, dec_27};
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Holiday holiday : holidays) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d", Locale.ENGLISH);
			String date = holiday.getDate().format(formatter);
			
			builder.append("Date: ").append(date)
			.append(", Holiday name -> ").append(holiday.getHolidayName())
			.append(", Type holiday -> ").append(holiday.getTypeHoliday())
			.append("\n");
		}	
		return builder.toString();
	}
	
}
