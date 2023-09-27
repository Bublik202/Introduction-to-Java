package ArrayCharacters;

public class Ex4 {
	
	/**
	 * В строке найти количество чисел.
	 */

	public static void main(String[] args) {
		String str = "T8 02IN L37NIY 23NI YA Y2 N46LYU24L N4 PLAZH3, K4K 283 2380CHKI IG94LI N4 P3SK3,"
				+"0NI 20LGO 79U2ILIS', 8S790YA P3SCH4NY 34M0K S 64SHNYAMI, SK9Y7YMI P90H024MI I M0S74MI.5";
	
		int count = 0;	
		boolean dig = true;
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i)) && dig) {				
				count++;
				dig = false;
			}else if(!Character.isDigit(str.charAt(i))){
				dig =true;
			}
			
		}		
		System.out.println("Count of numbers: "+count);
	}

}
