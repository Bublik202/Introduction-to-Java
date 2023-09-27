package WorkingWithString;

public class Ex5 {
	
	/**
	 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
	 */

	public static void main(String[] args) {
		String str = "I hate black man";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.printf("Count of 'a': %s", count);

	}

}
