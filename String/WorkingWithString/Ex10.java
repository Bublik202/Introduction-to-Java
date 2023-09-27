package WorkingWithString;

public class Ex10 {
	
	/**
	 * Строка X состоит из нескольких предложений,
	 * каждое из которых кончается точкой, восклицательным или вопросительным знаком. 
	 * Определить количество предложений в строке X.
	 */

	public static void main(String[] args) {
		String x = "Summer's end brings warm weather and vibrant flowers."
				+"What incredible adventures we could only dream of!"
				+"When will our next big road trip begin?";
		
		int count = 0;
		String[] str = x.split("[.!?]");
		
		for (String str2 : str) {
			if (!str2.trim().isEmpty()) {
				count++;
			}
		}
		System.out.printf("Count: %s", count);

	}

}
