package Task4;

import java.util.Objects;

public class Treasure {
	private String name;
	private Double cost;
	
	public Treasure(String name, Double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	
	public String getName() {
		return name;
	}

	public Double getCost() {
		return cost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treasure other = (Treasure) obj;
		return Objects.equals(cost, other.cost) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Name -> ").append(name)
		.append(", Cost -> ").append(cost);
		return builder.toString();
	}	

}
