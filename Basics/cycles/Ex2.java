package basics.cycles;

public class Ex2 {
	/**
	 * Вычислить значения функции на отрезке [а,b] c шагом h:
	 * y= x, x>2 = -x, x<=2
	 */

	public static void main(String[] args) { 
		int a = -4;
        int b = 12;
        int h = 3;
        int y;

        for (int i = a; i <= b; i+= h) {
            if (i > 3) {
                y = i;
            } else {
                y = -i;
            }
            System.out.println("With x = " + i + " y = " + y);
        }
        System.out.println();

	}

}