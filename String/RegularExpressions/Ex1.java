package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {
	
	/**
	 * Cоздать приложение, разбирающее текст (текст хранится в строке)
	 * и позволяющее выполнять с текстом три различных операции:
	 * отсортировать абзацы по количеству предложений;
	 * в каждом предложении отсортировать слова по длине;
	 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
	 * а в случае равенства – по алфавиту.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Create an application that parses text (the text is stored in a string) and allows you to perform three different\r\n"
				+ "operations with the text:"		
		+"\n1: sort paragraphs by number of sentences "
		+"\n2: in each sentence, sort the words by length "
		+"\n3: sort the tokens in the sentence in descending order of the number of occurrences of a given character,"
		+"\n   and in case of equality - alphabetically\n"
		+"\nif you want to exit the application, enter '0'\n");
	
		String str = "Regular expressionsmeven often postpone for later."
				+ "Of textual information. "
				+ "3 sentences are the norm!\n" //3
				+ "Is simply unthinkable."
				+ "Thiseee isee not such a difficulteeeee task. Somee text."
				+ "There are 5 suggestions! Gggeggggg ggee?\n" //5
				+ "WHat is a RegEx regular expression?"
				+ "Shall we sort it out now here 2 sentence?\r\n" //2
				+ "Actually a regular expression (RegEx)."
				+ "In Javatrhtdg mdm. That is, an object of the String class."
				+ "However, regular expression. Only the one the syntax defined in the language specification."
				+ "6 offers a lot!\n" //6
				+ "To write a regular expression,characters are used!"
				+ "As well syntax of regular expressions."
				+ "Pararam pampam 3 offers and so on!";//3	
		boolean check = true;
		int num;
		do {
			System.out.print("Write the task number from 1 to 3: ");
			num = scan.nextInt();
			
			switch (num) {
			case 0:
				check = false;
				break;			
			case 1:
				sortParagraph(str);
				break;			
            case 2:
            	sortSentences(str);
				break;					
            case 3: 
            	System.out.print("input 1 symbol: ");
            	String string = scan.next();
            	char ch = ' ';
            	if(string.length() == 1) {
            		ch = string.charAt(0);
            	}          	
        		sortSymbols(str, ch);
				break;

			default:
				System.err.print("Error number of menu. \n");
				break;
			}
			
		} while (num > 0 || num < 3 && check);
			
	}
	
	static Matcher paragraph(String str) {
		final String PARAGRAPH = ".+(\\r?\\n|$)";
		Pattern pat = Pattern.compile(PARAGRAPH);
		Matcher matcher = pat.matcher(str);	
		
		return matcher;      
	}
	
	//считает кол-во абзацев
	static int paragraphCount(String str) {
		Matcher matcher = paragraph(str);
		int count = 0;
		while(matcher.find()) {
			count++;		
		}
		return count; 	
		
	}
	
    static Matcher Sentence(String paragraph) {
    	final String SENTENCE = "[^\\w+]?[.?!]";
    	Pattern pat = Pattern.compile(SENTENCE);
    	Matcher matcher = pat.matcher(paragraph);
		return matcher;
	}
	
    //считает кол-во предложений в абзаце
	static int countSentence(String paragraph) {
		Matcher matcher = Sentence(paragraph);
		int count = 0;
		while(matcher.find()) {
			count++;
		}
		return count;
	}
	
	//РЕЗУЛТИРУЮЩИЯ ПЕРВАЯ ЗАДАЧА
	static void sortParagraph(String str) {
		Matcher matcher = paragraph(str);//текст разбит по параграфам
		int count = paragraphCount(str);//количество параграфов в тексте
		
//		String[] array = str.split("\r?\n");
		String[] array = new String[count];
		int a = 0;
		while(matcher.find()) {			
			array[a++] = matcher.group();
		}
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if(countSentence(array[j]) > countSentence(array[j+1])) {
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for (String string : array) {
			System.out.print(string);
		}
		
	}
	
//----------------------------------------------------------------------------------------------------------------
	
	//разбивает предложения
	static Matcher sentenceMatch(String str) {
		final String checkSentence = "[^.!?]+[.!?]";
		Pattern pat = Pattern.compile(checkSentence);
		Matcher matcher = pat.matcher(str);
		return matcher;
	}
		
	//считает все предложения в тексте
	static int countSentenceAll(String str) {	
		Matcher matcher = Sentence(str);
		int count = 0;
		while(matcher.find()) {
			count++;
		}
		return count;
	}
	
	//шаблон для разбиение слов
	static Matcher word(String sentence) {
		final String WORD = "\\w+";
    	Pattern pat = Pattern.compile(WORD);
    	Matcher matcher = pat.matcher(sentence);
		return matcher;
	}
	
	//считает кол-во слов в предложении
	static int countWord(String sentence) {
		Matcher matcher = word(sentence);
		int count = 0;
		while(matcher.find()) {
			count++;
		}
		return count;
	}	
	
	//разбиваю слова в строке
	static String[] checkWord(String strCheck) {
		Matcher matcher = word(strCheck);
		int i = 0;
		String[] array = new String[countWord(strCheck)];
		while(matcher.find()) {
			array[i++] = matcher.group();
		}
		return array;
	}
	
	//РЕЗУЛТИРУЮЩИЯ ВТОРАЯ ЗАДАЧА
	static void sortSentences(String str) {	
		Matcher matcher = sentenceMatch(str);
		int count = countSentenceAll(str);	
		
		//лежит каждое предложение в массиве под индексом
		String[] array = new String[count];
		int k = 0;
		while(matcher.find()) {
			array[k++] = matcher.group();
		}			
		
		//лежит каждое слово из предложения в массиве под индексом
		int b = 1;
		for (int a = 0; a < array.length; a++) {			     
			String[] checkStr = checkWord(array[a]);	
			System.out.println();
			for (int i = 0; i < checkStr.length-1; i++) {
				for (int j = 0; j < checkStr.length-1-i; j++) {
					if(checkStr[j].length() > checkStr[j+1].length()) {
						String temp = checkStr[j];
						checkStr[j] = checkStr[j+1];
						checkStr[j+1] = temp;
					}
				}
			}
			System.out.print(b+": ");
			for (String string : checkStr) {				
				System.out.print(string+" ");
				
			}
			b++;
		}
	}
	
//----------------------------------------------------------------------------------------------------------------	

	//Считает кол-во вхождений в заданой буквы в слове
	static int countSymbols(String word, char symbol){
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == symbol) {
				count++;
			}
		}		
		return count;
	}
	
    static String extractLetters(String str, Pattern pattern) {
        StringBuilder letters = new StringBuilder();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            letters.append(matcher.group());
        }
        return letters.toString();
    }
	
	//сортировка по алфавиту
	static void sortAlphabet(String[] words, Pattern pattern) {
		for (int i = 0; i < words.length - 1; i++) {
	        for (int j = i + 1; j < words.length; j++) {
	            String letters1 = extractLetters(words[i], pattern);
	            String letters2 = extractLetters(words[j], pattern);
	            if (letters1.compareToIgnoreCase(letters2) > 0) {
	                String temp = words[i];
	                words[i] = words[j];
	                words[j] = temp;
	            }
	        }
	    }
		
    }
	
	//РЕЗУЛТИРУЮЩИЯ ТРЕТЯЯ ЗАДАЧА
	static void sortSymbols(String str, char symbol) {
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = sentenceMatch(str);
		int countLength = countSentenceAll(str);	
		
		//лежит каждое предложение в массиве под индексом
		String[] array = new String[countLength];
		int k = 0;
		while(matcher.find()) {
			array[k++] = matcher.group();
		}		
		
		for (int a = 0; a < array.length; a++) {
			String[] checkSybols = checkWord(array[a]);
			sortAlphabet(checkSybols, pattern);
			for (int i = 0; i < checkSybols.length-1; i++) {
				for (int j = 0; j < checkSybols.length-1-i; j++) {
					if(countSymbols(checkSybols[j], symbol) < countSymbols(checkSybols[j+1], symbol)) {
						String temp = checkSybols[j];
						checkSybols[j] = checkSybols[j+1];
						checkSybols[j+1] = temp;
					}
				}
			}
			for (String string : checkSybols) {
				System.out.print(a+1+": "+string +" ("+symbol+"-"+countSymbols(string, symbol)+") ");
			}
			System.out.println();		
		}
		
	}
	
}
