package Task4;

public enum Actions {
	VIEWALLTREASURE(){

		@Override
		public void start() {
			System.out.println("All treasure: ");
			cave.allTreasure();
		}
		
	}, MOST_EXPENSIVE(){

		@Override
		public void start() {
			System.out.println("The most expensive treasure: " );
			cave.mostExpensive();			
		}
		
	}, MOST_CHEAPER(){

		@Override
		public void start() {
			System.out.println("The most cheap treasure: " );
			cave.mostСheap();		
		}
	
	}, CHOSSE_TREASURE(){

		@Override
		public void start() {		
			cave.payTreasure();			
		}
		
	}, CHECK_MONEY(){

		@Override
		public void start() {
			cave.watchTrash();			
		}
		
	}, EXIT() {
		@Override
		public void start() {
			isExit = true;		
			System.out.println("You ran away with the treasures!");
		}
	};
	
	public abstract void start(); 
	static boolean isExit = false;
	private static Cave cave;
	
	public static boolean isExit() {
		return isExit;
	}
	public static void setExit(boolean isExit) {
		Actions.isExit = isExit;
	}
	public static Cave getCave() {
		return cave;
	}
	public static void setCave(Cave cave) {
		Actions.cave = cave;
	}
	
	
	
}
