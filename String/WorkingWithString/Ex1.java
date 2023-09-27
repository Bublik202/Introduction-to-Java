package WorkingWithString;

public class Ex1 {
	
	/**
	 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
	 */

	public static void main(String[] args) {
		String str = "   She received a            word of advice from her   mentor word,"
				+ "who  told her     to always  keep her word .   ";
		
		int max = Integer.MIN_VALUE;	
		int count = 0;
		for (int i = 0; i < str.length(); i++) {		
			if(str.charAt(i) == ' ') {
				count++;				
			}else {
				count = 0;
			}
			if(count > max) {
				max = count;
			}
		}		
		System.out.println("Count: "+max);		 

	}

}
