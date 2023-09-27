package ArrayCharacters;

public class Ex1 {
	
	/**
	 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
	 */

	public static void main(String[] args) {
		String[] array = {"camelCase","snakeCase","wolfEpam"};
		for (int i = 0; i < array.length; i++) {		
			StringBuilder temp = new StringBuilder(array[i]);
			for (int j = 0; j < temp.length(); j++) {
				if(Character.isUpperCase(temp.charAt(j))) {					
					System.out.println(Insertion(temp, j).toString().toLowerCase());	
					break;
				}
			}
		
		}
		
	}
	
	static StringBuilder Insertion(StringBuilder word, int index) {	
		word.insert(index,"_");
		return word;
	}

}
