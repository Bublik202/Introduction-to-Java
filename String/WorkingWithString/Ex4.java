package WorkingWithString;

public class Ex4 {
	
	/**
	 * С помощью функции копирования и операции конкатенации
	 * составить из частей слова “информатика” слово “торт”.
	 */

	public static void main(String[] args) {
		String str = "informatica";
		char[] ch = str.toCharArray();
		StringBuilder builder = new StringBuilder();		
		
		builder.append(String.valueOf(ch[7]))
			.append(String.copyValueOf(ch, 3, 2))
			.append(String.valueOf(ch[7]));
		
		System.out.printf("Result: %s", builder.toString());

	}

}
