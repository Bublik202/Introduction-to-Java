package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
	
	/**
	 * Дана строка, содержащая следующий текст (xml-документ):
	 * <notes>
	 * <note id = "1">
	 * <to>Вася</to>
	 * <from>Света</from>
	 * <heading>Напоминание</heading>
	 * <body>Позвони мне завтра!</body>
	 * </note>
	 * <note id = "2">
	 * <to>Петя</to>
	 * <from>Маша</from>
	 * <heading>Важное напоминание</heading>
	 * <body/>
	 * </note>
	 * </notes>
	 * 
	 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип 
	 * (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
	 * Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
	 */

	public static void main(String[] args) {
		String str = "<notes>\r\n"
				+ " <note id = \"1\">\r\n"
				+ " <to>Jordan</to>\r\n"
				+ " <from>Galina</from>\r\n"
				+ " <heading>Reminder</heading>\r\n"
				+ " <body>Call me tomorrow!</body>\r\n"
				+ " </note>\r\n"
				+ " <note id = \"2\">\r\n"
				+ " <to>Leon</to>\r\n"
				+ " <from>Sveta</from>\r\n"
				+ " <heading>Important reminder</heading>\r\n"
				+ " <body/>\r\n"
				+ " </note>\r\n"
				+ "</notes>";
		
		Pattern patternOpen = Pattern.compile("<\\w.+?>");
		Pattern patternClose = Pattern.compile("<\\/+\\w+>");
		Pattern patternСontent = Pattern.compile("(<\\w+>)(.+)(</\\w+>)");
		Pattern patternWithOutBody = Pattern.compile("<\\w+\\/+>");	
		
		Pattern pattern = Pattern.compile("\\r?\\n|$");
		String[] array = pattern.split(str);
		
		for (String string : array) {
			Matcher open = patternOpen.matcher(string);
			Matcher close = patternClose.matcher(string);
			Matcher content = patternСontent.matcher(string);
			Matcher withOutBody = patternWithOutBody.matcher(string);
			
			if(withOutBody.find()) {
				System.out.println(withOutBody.group()+" <-- with out content");
			}else
			if(open.find()) {
				System.out.println(open.group()+" <-- open teg");
			}
			if(content.find()) {
				System.out.println(content.group(2)+" <-- content teg");
			}
			
			if(close.find()) {
				System.out.println(close.group()+" <-- close teg");
			}			
			
		}
		
	}

}
