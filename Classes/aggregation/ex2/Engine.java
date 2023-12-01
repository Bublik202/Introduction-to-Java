package aggregation.ex2;

public class Engine {
	private double volume;
	private int countPistons;
	
	public Engine(double volume, int countPistons) {
		super();
		this.volume = volume;
		this.countPistons = countPistons;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public int getCountPistons() {
		return countPistons;
	}

	public void setCountPistons(int countPistons) {
		this.countPistons = countPistons;
	}
	
	@Override
	public String toString() {
		return "[volume = " + volume + ", countPistons = " + countPistons + "]";
	}
	
}
