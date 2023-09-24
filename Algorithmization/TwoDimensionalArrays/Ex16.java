package TwoDimensionalArrays;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex16 {
	/**
	 * Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ...,n^2
	 *  так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. 
	 *  Построить такой квадрат. Пример магического квадрата порядка 3:
	 *  
	 *  6	1	8
	 *  7	5	3
	 *  2	9	4
	 */

	public static void main(String[] args) {	
		int n;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Input the dimension of the matrix 3 or 4: ");
			n = scan.nextInt();
		} while(n <= 2 || n>4);	
		
		//создаю двухмерный массив и заполняю его
		int[][] matrix = new int[n][n];
		generateMagicSquare(matrix, n);
		
		BigDecimal decimalValue = new BigDecimal("0");
        System.out.println(decimalValue);
		while(!magicSquare(matrix, n)) {
			swapNumber(matrix);	
			for (int i = 0; i < matrix.length; i++) {
				System.out.print(Arrays.toString(matrix[i]));
			}
	        decimalValue = decimalValue.add(BigDecimal.ONE);
			System.out.println(decimalValue);			 
		}
		//вывожу окончательный магический квадрат
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
		}
		
	}
	
	public static void generateMagicSquare(int[][] matrix, int n) {		
		//заполняю двухмерный массив
        int value = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = ++value;              
            }
        }
    }
	
	public static void swapNumber(int[][] magicSquare) {
		int n = magicSquare.length;
		
		//перевожу двухмерный массив в одномерный
		int count = 0;
		int[] matrixOne = new int[n*n]; //array to store N random integers       
        for (int i = 0; i < magicSquare.length; i++) {
        	for(int j = 0; j < magicSquare[i].length; j++) {
        		matrixOne[count++] = magicSquare[i][j];
        	}
            
        }
        System.out.println(Arrays.toString(matrixOne));
        
        //меняю случайные числа в одномерном массиве
		int index;
		int value;		
		double max=n*n;
		double min=1;	
		for(int i=0; i<matrixOne.length; i++) {			
			index = (int)(Math.random() * ((max - min)+1) + min);//1-16
			value=matrixOne[index-1];//0-15
			matrixOne[index-1]=matrixOne[i];
			matrixOne[i]=value;	
		}
		//меняю обратно одномерный массив в двухмерный
		count = 0;
		for (int i = 0; i < magicSquare.length; i++) {
        	for(int j = 0; j < magicSquare[i].length; j++) {
        		magicSquare[i][j] = matrixOne[count++];
        	}
            
        }
		
	}
	//второй метод подбора
//	public static void swapNumber(int[][] magicSquare) {
//        Random random = new Random();
//
//        // Перестановка чисел в квадрате случайным образом
//          int n = magicSquare.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                int randRow = random.nextInt(i + 1);
//                int randCol = random.nextInt(j + 1);
//
//                int temp = magicSquare[i][j];
//                magicSquare[i][j] = magicSquare[randRow][randCol];
//                magicSquare[randRow][randCol] = temp;
//            }
//        }
//		
//    }

	public static boolean magicSquare(int[][] matrix,int n) {
		//проверяю все столбцы,строки и диагонали на сумму
		int magicConst = (n * (n * n + 1)) / 2;
		int [] sumLine = new int[n];			
		for (int i = 0; i < matrix.length; i++) { //сумма чисел в строках
            for (int j = 0; j < matrix[i].length; j++) {
                sumLine[i] += matrix[i][j]; 	                
            }
            if (sumLine[i] != magicConst) {	
            	return false;            	
            } 
        }						
		
        for (int i = 0; i < matrix.length; i++) {
            int sumColumn = 0;
            for (int j = 0; j < matrix.length; j++) {	                
                sumColumn += matrix[j][i];
            }	            
            if ((sumLine[i] != magicConst) || (sumColumn != magicConst)) {
                return false;               
            }
        }      
        	         
        int diagonalLeft = 0;
        int diagonalRight = 0;
        for (int i = 0; i < matrix.length; i++) { 
            diagonalLeft += matrix[i][i];            
            diagonalRight += matrix[i][matrix.length - 1 - i];
        }
            
        if (diagonalLeft != magicConst || diagonalRight != magicConst) {            
            return false;
            
        }
        return true;
	}
	
}	
