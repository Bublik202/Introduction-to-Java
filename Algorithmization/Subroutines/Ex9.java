package Subroutines;

public class Ex9 {
	
	/**
	 * Даны числа X, Y, Z, Т — длины сторон четырехугольника.
	 * Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой
	 */
	public static void main(String[] args) {
		double x = 3.5;
		double y = 5.0;
		double z = 2.5; 
		double square = (z+y)*x / 2;
		System.out.println("The square of tetragon: "+square);

	}

}
