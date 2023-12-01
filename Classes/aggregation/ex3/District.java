package aggregation.ex3;

import java.util.Arrays;

public class District {
	private String name;
	private City[] cities;
	private RegionEnum regionEnum;
	
	public District(String name, RegionEnum regionEnum) {
		super();
		this.name = name;
		this.regionEnum = regionEnum;
	}
	
	public City[] getCities() {
		return cities;
	}
	
	public void setCities(City[] cities) {
		this.cities = cities;
	}

	public RegionEnum getRegionEnum() {
		return regionEnum;
	}

	public void getCities(DistrictEnum districtEnum, District district) {
		int i = 0;
		int countCity = CityEnum.values().length;
		City[] cities = new City[countCity];
		for (CityEnum cityEnum : CityEnum.values()) {
			if(cityEnum.getDistrictEnum() == districtEnum) {					
				City city = new City(cityEnum.name(), cityEnum.getDistrictEnum());
				cities[i++] = city;
			}
			
		}	
							
		district.setCities(Arrays.copyOf(cities, i));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\t");
		builder.append(name).append(": ");		
		for (City city : cities) {
			builder.append(city);
		}
		builder.append("\n");
		return builder.toString();
		
	}
	
}
