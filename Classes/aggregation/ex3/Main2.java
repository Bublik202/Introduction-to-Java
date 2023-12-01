package aggregation.ex3;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		Government government = new Government();
		
		for (RegionEnum regionEnum : RegionEnum.values()) {
			Region region = new Region(regionEnum.name(), regionEnum.getSquare(), regionEnum.getCapital());	
			
			int countDistrict = DistrictEnum.values().length;
			District[] districts = new District[countDistrict];
			int d = 0;
			for (DistrictEnum districtEnum : DistrictEnum.values()) {
				if(districtEnum.getRegionEnum() == regionEnum) {
					District district = new District(districtEnum.name(), districtEnum.getRegionEnum());
					
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
					
					districts[d++] = district;
				}	
			}
			
			region.setDistricts(Arrays.copyOf(districts, d));
			
			government.addRegion(region);
		}		

		System.out.println(government);

	}

}
