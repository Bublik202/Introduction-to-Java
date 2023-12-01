package aggregation.ex1;

public class Main {

	public static void main(String[] args) {
		Text text = new Text("Hochey", 10);		
		Word word = new Word("Stick");
		Word word2 = new Word("puck");
		Word word3 = new Word("helmet");
		Word word4 = new Word("goal");
	
		Sentence sentence = new Sentence(word, word2, word3);
		Sentence sentence2 = new Sentence(word4, new Word("arena"));		
		text.add(sentence);
		text.add(sentence2);

		text.print();

	}

}
