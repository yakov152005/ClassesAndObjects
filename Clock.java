import java.util.Scanner;

public class Clock {
	private int seconds, minutes, hour;

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
		if (hour < 10) {
			System.out.print("0");
		}
		System.out.print(hour + ":");
		if (minutes < 10) {
			System.out.print("0");
		}
		System.out.print(minutes + ":");
		if (seconds < 10) {
			System.out.print("0");
		}
		System.out.print(seconds);
	}

	public void setHour(int h) {
		if (h >= 24) {
			int newH = 24;
			hour = h - newH;
		} else {
			hour = h;
		}

	}

	public void setMinutes(int m) {
		if (m >= 60) {
			int newM = 60;
			minutes = m - newM;
		} else {
			minutes = m;
		}
	}

	public void setSeconds(int s) {
		if (s >= 60) {
			int newS = 60;
			seconds = s - newS;
		} else {
			seconds = s;
		}
	}

	public int getHour() {
		return hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public int getInput() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
}


