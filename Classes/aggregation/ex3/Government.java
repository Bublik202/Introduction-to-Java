package aggregation.ex3;

public class Government {
	private static final String NAME = "Belarus";
	private Region[] regions;
	private int regionCount = 0;

	public Government() {
		super();		
		this.regions = new Region[RegionEnum.values().length];		
	}
	
	public void addRegion(Region region) {
		if(regionCount < regions.length) {
			regions[regionCount++] = region;
		}
	}
	
	public void getRegions(Government government) {
		for (RegionEnum regionEnum : RegionEnum.values()) {
			Region region = new Region(regionEnum.name(), regionEnum.getSquare(), regionEnum.getCapital());	
			
			region.getDistricts(regionEnum, region);
			
			addRegion(region);
		}
	}
	
	public int getRegionCount() {
		return regionCount;
	}
	
	public String capital() {
		String capital = "";
		for (Region region : regions) {	
//			RegionEnum regName = RegionEnum.valueOf(region.getName());
//			regName.getCapital().getCityName();			
			
			if(region.getCenter().getCityName().equals(CityEnum.MINSK.name())) {
				capital = region.getCenter().getCityName();
			}
		}
		return capital;
	}

	public String regionalCenters() {
		StringBuilder builder = new StringBuilder();
		for (Region region : regions) {
			for (District district : region.getDistricts()) {
				for (City city : district.getCities()) {
					if(city.equals(region.getCenter())) {						
						builder
							.append(region.getName())
							.append(": ")
							.append(region.getCenter())
							.append("square: ")
							.append(region.getSquare())
							.append("km2;\n");
					}
				}
			}		
		}
		return builder.toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n").append(NAME).append(":\n");
		for (Region region : regions) {
			builder.append(region);
		}		
		return builder.toString();
	}

}
