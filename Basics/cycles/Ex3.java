package basics.cycles;

public class Ex3 {
	/**
	 * Найти сумму квадратов первых ста чисел
	 */

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i*i;
			System.out.println("The sum= " + sum);
			System.out.println();
		}

	}

}
