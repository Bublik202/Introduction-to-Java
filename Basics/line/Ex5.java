package basics.line;

public class Ex5 {
	/**
	 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
	 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
     * ННч ММмин SSc.
	 */

	public static void main(String[] args) {
		// T = Длительность времени в секундах
		int sec = 62_599;
		int minute = 60;
		int hours = 3600;
		//Данные чисел
		int timeS;
		int timeM;
		int timeH = sec/hours;
		//Деление чисел
		System.out.println("Time in HH " +timeH);
		timeM = (sec-(timeH*3600))/60;
		System.out.println("Time in MM " +timeM);
		timeS = sec-(timeH*3600)-(timeM*60);
		System.out.println("Time in SS " +timeS);
			
		
	}

}
