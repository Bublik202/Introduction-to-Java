package aggregation.ex1;

public class Text {
	private Sentence[] sentences;
	private String title; 
	private int count;

	public Text(String title , int maxSentence) {
		super();
		this.title = title;
		this.sentences = new Sentence[maxSentence];
		this.count = 0;
	}
	
	public void add(Sentence sentence) {
		if(count < sentences.length) {
			sentences[count++] = sentence;
		}
	}
	
	public void print() {
		System.out.println("Title: "+title);
		for (Sentence sentence : sentences) {
			if(sentence != null) {
				System.out.println(sentence);
			}
		}
	}

}
