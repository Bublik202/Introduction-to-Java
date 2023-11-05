package Ex3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Student {
	
	private String surname;
	private int numberGroup;
	private int[] progress;

	public Student(String surname) {
		super();
		this.surname = surname;	
		
		this.progress = new int [5];
		setProgress(progress);
		
		Random random = new Random();
		this.numberGroup = random.nextInt(1, 15);
	}

	public String getSurname() {
		return surname;
	}

	public int getNumberGroup() {
		return numberGroup;
	}

	public int[] getProgress() {
		return progress;
	}

	public void setProgress(int[] progress) {
		Random random = new Random();
		for (int i = 0; i < this.progress.length; i++) {
			this.progress[i] = random.nextInt(1, 11);
		}
	}

	@Override
	public String toString() {
		return "Student: surname = " + surname + ", numberGroup = " + numberGroup + ", progress = "
				+ Arrays.toString(progress);
	}
	
}
