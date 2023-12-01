package aggregation.ex3;

public class Main {

	public static void main(String[] args) {
		Government government = new Government();	
		
		government.getRegions(government);		
		//System.out.println(government);	
		String regionCenters = government.regionalCenters();
		System.out.println("Region centers: \n" + regionCenters);
		System.out.println("Number of centers: "+government.getRegionCount());
		System.out.println("The capital is: "+government.capital());
		
	}

}
