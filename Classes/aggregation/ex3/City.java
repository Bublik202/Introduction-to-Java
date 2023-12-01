package aggregation.ex3;

import java.util.Objects;

public class City {
	private String cityName;
	private DistrictEnum districtEnum;
	
	public City(String cityName, DistrictEnum districtEnum) {
		super();
		this.cityName = cityName;
		this.districtEnum = districtEnum;
	}
	
	public String getCityName() {
		return cityName;
	}
	public DistrictEnum getDistrictEnum() {
		return districtEnum;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(cityName, districtEnum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(cityName, other.cityName) && districtEnum == other.districtEnum;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(cityName).append("; ");	

		return builder.toString();
	}
		
}
