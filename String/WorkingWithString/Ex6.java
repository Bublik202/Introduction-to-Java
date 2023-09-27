package WorkingWithString;

public class Ex6 {
	
	/**
	 * Из заданной строки получить новую, повторив каждый символ дважды
	 */

	public static void main(String[] args) {
		String str = "abc";
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			builder.append(str.charAt(i)).append(str.charAt(i));
		}
		
		System.out.println("Result: "+builder);
	}

}
