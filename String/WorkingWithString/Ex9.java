package WorkingWithString;

public class Ex9 {
	
	/**
	 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
	 * Учитывать только английские буквы.
	 */

	public static void main(String[] args) {
		String str = "One tWo thReE four FIVE Six seVen";
		int countLarge = 0;
		int countLittle = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				countLittle++;
			}
			if(Character.isUpperCase(str.charAt(i))) {
				countLarge++;
			}
		}
		System.out.printf("Large: %s", countLarge);
		System.out.printf("\nLIttle: %s", countLittle);

	}

}
