import java.util.Scanner;

public class Clock {
	private int seconds, minutes, hour;

	public Clock(int hour, int minutes, int seconds){
		System.out.println("|Enter new Clock|");
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public void reset() {
		hour = 0;
		minutes = 0;
		seconds = 0;
	}

	public void tick() {
		seconds++;

		if (seconds == 60) {
			minutes++;
			seconds = 0;
		}
		if (minutes == 60) {
			hour++;
			minutes = 0;
		}
		if (hour == 24) {
			hour = 0;
		}
	}

	public void show() {
		if (this.hour < 10) {
			System.out.print("0");
		}
		System.out.print(this.hour + ":");
		if (this.minutes < 10) {
			System.out.print("0");
		}
		System.out.print(this.minutes + ":");
		if (this.seconds < 10) {
			System.out.print("0");
		}
		System.out.print(this.seconds);
	}

	public void setHour(int hour) {
		if (hour >= 24) {
			int newH = 24;
			this.hour = hour - newH;
		} else {
			this.hour = hour;
		}

	}

	public void setMinutes(int minutes) {
		if (minutes >= 60) {
			int newM = 60;
			this.minutes = minutes - newM;
		} else {
			this.minutes = minutes;
		}
	}

	public void setSeconds(int seconds) {
		if (seconds >= 60) {
			int newS = 60;
			this.seconds = seconds - newS;
		} else {
			this.seconds = seconds;
		}
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinutes() {
		return this.minutes;
	}

	public int getSeconds() {
		return this.seconds;
	}

	public int getInput() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
}


