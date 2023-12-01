package aggregation.ex3;

import java.util.Arrays;

public class Region {
	private String nameRegion;
    private double square;
    private City center;
    private District[] districts;
    
	public Region(String nameRegion, double square, City center) {
		super();
		this.nameRegion = nameRegion;
		this.square = square;
		this.center = center;	
	}

	public String getName() {
		return nameRegion;
	}

	public City getCenter() {
		return center;
	}

	public void setDistricts(District[] districts) {
		this.districts = districts;
	}

	public District[] getDistricts() {
		return districts;
	}	
	
	public double getSquare() {
		return square;
	}

	public void getDistricts(RegionEnum regionEnum, Region region) {
		int countDistrict = DistrictEnum.values().length;
		District[] districts = new District[countDistrict];
		int d = 0;
		for (DistrictEnum districtEnum : DistrictEnum.values()) {
			if(districtEnum.getRegionEnum() == regionEnum) {
				District district = new District(districtEnum.name(), districtEnum.getRegionEnum());
				
				district.getCities(districtEnum, district);		
				
				districts[d++] = district;
			}	
		}
		
		region.setDistricts(Arrays.copyOf(districts, d));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nameRegion).append(": ");
		builder.append("square: ").append(square).append("; ");
		builder.append("center: ").append(center).append("\n");
		
		for (District district : districts) {
			builder.append(district).append(" ");
		}
		builder.append("\n");
		return builder.toString();
	}
	
}
