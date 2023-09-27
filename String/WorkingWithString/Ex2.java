package WorkingWithString;

public class Ex2 {
	
	/**
	 * В строке вставить после каждого символа 'a' символ 'b'.
	 */

	public static void main(String[] args) {
		String str = "aacab";
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				builder.append(str.charAt(i)).append("b");
			}else {
				builder.append(str.charAt(i));
			}
		}
		System.out.println("Result String: "+builder);

	}

}
