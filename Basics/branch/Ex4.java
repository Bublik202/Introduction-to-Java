package basics.branch;

import java.util.Scanner;

public class Ex4 {
	/**
	 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить,
	 * пройдет ли кирпич через отверстие.
	 */

	public static void main(String[] args) {
		int x = 250;
		int y = 120;
		int z = 65;
		System.out.println("Brick sizes: lenght - "+x+" width - "+y+" height - "+ z);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("input a: ");
		int a = scanner.nextInt();
		System.out.print("Input b: ");
		int b = scanner.nextInt();
		
		int dAB = (int)Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("diagonally AB: "+dAB);
		
		int dXY = (int)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("diagonally XY: "+dXY);
		int dXZ = (int)Math.sqrt(Math.pow(x, 2) + Math.pow(z, 2));
		System.out.println("diagonally XZ: "+dXZ);
		int dYZ = (int)Math.sqrt(Math.pow(y, 2) + Math.pow(z, 2));
		System.out.println("diagonally YZ: "+dYZ);
		
		if(a>x && b>y || b>z && a>x || a>y && b>z || a>z && b>y || a>z && b>x ) {
			System.out.println("The brick passes through the hole on the sides");
		}else if(dXY<dAB || dXZ<dAB || dYZ<dAB) {
				System.out.println("The brick passes through the hole diagonally");						
		}else {
			System.out.println("The brick no passes through the hole");
		}

	}

}
