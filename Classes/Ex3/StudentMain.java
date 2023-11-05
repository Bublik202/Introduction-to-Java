package Ex3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input count of student: ");
		int countSudent = in.nextInt();
		String[] surname = new String[countSudent];
		Student[] students =  new Student[countSudent];
		for (int i = 0; i < surname.length; i++) {
			students[i] = new Student("name_" + (i+1));
		}
		
		for (Student student : students) {			
			for (int score : student.getProgress()) {
				if(score >= 9) {
					System.out.println(student);
					break;
				}
			}
		}
		
//		for (int i = 0; i < students.length; i++) {
//			int[] score = students[i].getProgress();
//			for (int j = 0; j < score.length; j++) {
//				if(score[j] >= 9) {
//					System.out.println(students[i]);
//					break;
//				}
//			}		
//		}

	}

}
