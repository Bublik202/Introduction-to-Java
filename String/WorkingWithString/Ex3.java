package WorkingWithString;

public class Ex3 {
	
	/**
	 * Проверить, является ли заданное слово палиндромом.
	 */

	public static void main(String[] args) {
		String word = "topot";
		StringBuilder rev = new StringBuilder();

		for (int i = word.length()-1; i >= 0; i--) {
			rev.append(word.charAt(i));
		}
				
		if(word.equals(rev.toString())) {
			System.out.printf("yes it's a palindrome word: %s", word);
		}else {
			System.out.printf("No it isn't a palindrome word: %s", word);
		}

	}

}
