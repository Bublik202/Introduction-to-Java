package Ex6;

import java.time.LocalTime;

public class Clock {
	private int hours;
	private int minutes;
	private int seconds;		
	private LocalTime time = LocalTime.now();

	public Clock(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		
	}

	public LocalTime getTime() {
		return time;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours >= 0 && hours <= 23) {
			this.hours = hours;
			updateTime();
		} else {
			this.hours = 0;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
            updateTime();
        } else {
            this.minutes = 0;
        }
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds >= 0 && seconds <= 59) {
			this.seconds = seconds;
			updateTime();
		} else {
			this.seconds = 0;
		}
	}
	
	public void updateTime() {
        this.time = LocalTime.of(hours, minutes, seconds);
    }

	@Override
	public String toString() {
		return "Clock time = " + time;
	}

}
