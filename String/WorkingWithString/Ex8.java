package WorkingWithString;

import java.util.StringTokenizer;

public class Ex8 {
	
	/**
	 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
	 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
	 */

	public static void main(String[] args) {
		String str = "kid people knife ?fork one seven spoon. 5656555";
		StringBuilder longWord = new StringBuilder();
		
		
		StringTokenizer tokenizer = new StringTokenizer(str, " ,.!?0123456789");
		int max  = Integer.MIN_VALUE;
		while (tokenizer.hasMoreTokens()) {
			String check = tokenizer.nextToken();
			
			if(check.length() > max) {
				max = check.length();
				longWord.delete(0, longWord.length());
				longWord.append(check);
			}
		}
		System.out.printf("The longest word is: %s", longWord.toString());

	}

}
