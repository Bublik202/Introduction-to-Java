package basics.line;

public class Ex4 {
	/**
	 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
	 * Поменять местами дробную и целую части числа и вывести полученное значение числа
	 */

	public static void main(String[] args) {
		double x = 234.583;
		System.out.println("Data: "+x);
        double y = (int)x;
        // Y = 123 это целая часть, сначала я Y делю на 1000 так я делаю число 123 после запятой
        // X = 123.456 тут мне дробную часть надо переделать в целую и я умножаю на 1000 так получается 456.000
        // RESULT = y + x или 0.123 + 456 это ровно 456.12300000
        double result = y / 1000 + (x - y) * 1000;
        System.out.println("Result: "+scale(result));

	}
	
	public static double scale(double point) {	
		double scale = Math.pow(10, 3);
		double z = Math.ceil(point * scale) / scale;

		return z;

	}

}
