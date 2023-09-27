package ArrayCharacters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5 {
	
	/**
	 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
	 * Крайние пробелы в строке удалить
	 */

	public static void main(String[] args) {
		String str = "   She received a            word of advice from her   mentor word,"
				+ "who  told her     to always  keep her word .     ";
		Pattern pat = Pattern.compile("\\w+");
		Matcher matc = pat.matcher(str);
		while(matc.find()) {
			System.out.print(matc.group()+" ");
		}
	}

}
