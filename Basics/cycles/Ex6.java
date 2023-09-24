package basics.cycles;

public class Ex6 {
	/**
	 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
	 */

	public static void main(String[] args) {		
		for (int i = 33; i <= 183; i++) {
			System.out.print(i+" "+(char)i+" ");				
			if(i%20==0) System.out.println();
			
		}

	}

}
