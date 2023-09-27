package ArrayCharacters;

public class Ex2 {
	
	/**
	 * Замените в строке все вхождения 'word' на 'letter'.
	 */

	public static void main(String[] args) {
		String str = "She received a word of advice from her mentor word,"
				+ "who told her to always keep her word.";
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			if(i <= str.length()-4 && str.substring(i, i+4).equals("word")) {
				builder.append("letter");
				i += 3;
			}else {
				builder.append(str.charAt(i));
			}			
		}
		
		System.out.println("Result: "+builder.toString());		
					
	}
	
}
