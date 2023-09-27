package WorkingWithString;

public class Ex7 {
	
	/**
	 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
	 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
	 */

	public static void main(String[] args) {
		String str = "abc cde def";
		String space = str.replaceAll("\\s", "");
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < space.length(); i++) {
            char ch = space.charAt(i);
            if (space.indexOf(ch) == i) {
                builder.append(ch);
            }
        }	
		
		System.out.printf("Result: %s", builder.toString());
	}

}
