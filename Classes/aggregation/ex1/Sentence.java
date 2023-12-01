package aggregation.ex1;

public class Sentence {
	private Word[] word;
	
	public Sentence(Word ... value) {
		super();
		this.word = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Word res : word) {
			builder.append(res.getWord()).append(" ");
		}		
		return builder.toString();
	}

}
