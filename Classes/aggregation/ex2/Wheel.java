package aggregation.ex2;

public class Wheel implements createWheel{
	private TypeWheel typeRubber;
	private NameWheel name;

	public Wheel(TypeWheel typeRubber, NameWheel name) {
		super();
		this.typeRubber = typeRubber;
		this.name = name;
	}

	public TypeWheel getTypeRubber() {
		return typeRubber;
	}

	public void setTypeRubber(TypeWheel typeRubber) {
		this.typeRubber = typeRubber;
	}

	public NameWheel getName() {
		return name;
	}

	public void setName(NameWheel name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[typeRubber = " + typeRubber + ", name = " + name + "]";
	}

	@Override
	public Wheel[] create() {		
		return new Wheel[] {
			this, this, this, this
			//new Wheel(getTypeRubber(), getName())
		};
	}
	
}
