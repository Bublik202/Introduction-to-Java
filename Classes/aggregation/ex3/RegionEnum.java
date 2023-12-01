package aggregation.ex3;

public enum RegionEnum {
	BREST_REGION(32_790.68) {
		@Override
		public City getCapital() {			
			return new City(CityEnum.BREST.name(), CityEnum.BREST.getDistrictEnum());
		}
	}, 
	VITEBSK_REGION(40_400.99) {
		@Override
		public City getCapital() {		
			return new City(CityEnum.VITEBSK.name(), CityEnum.VITEBSK.getDistrictEnum());
		}
	}, 
	GOMEL_REGION(40_361.66) {
		@Override
		public City getCapital() {
			return new City(CityEnum.GOMEL.name(), CityEnum.GOMEL.getDistrictEnum());
		}
	}, 
	GRODNO_REGION(25_118.07) {
		@Override
		public City getCapital() {
			return new City(CityEnum.GRODNO.name(), CityEnum.GRODNO.getDistrictEnum());
		}
	},
	MINSK_REGION(39_912.35) {
		@Override
		public City getCapital() {
			return new City(CityEnum.MINSK.name(), CityEnum.MINSK.getDistrictEnum());
		}
	},
	MOGILEV_REGION(29_079.01) {
		@Override
		public City getCapital() {
			return new City(CityEnum.MOGILEV.name(), CityEnum.MOGILEV.getDistrictEnum());
		}
	};

	double square;
	
	private RegionEnum(double square) {		
		this.square = square;
	}

	public double getSquare() {
		return square;
	}
	
	public abstract City getCapital();
	
}
