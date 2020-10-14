package angleOnClock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AngleOnClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		try {
			Time t = new Time(sc.nextInt(), sc.nextInt());
			System.out.println(t.getTime());
		} catch (InputMismatchException e) {
			System.out.println("Enter an integer");
			e.printStackTrace();

		}

	}

}

class Time {
	private int hr;
	private int min;

	//constructor
	public Time(int a, int b) {
		hr = a;
		min = b;
	}

	public int getValueHr() {
		return hr;
	}

	public int getValueMin() {
		return min;
	}

	public void assignTime(int a, int b) {
		hr = a;
		min = b;
	}

	public void assignTime(int a) {
		hr = a;
		min = 0;
	}

	public int getTime() {

		return Math.abs(this.hr * 5 * 6 + this.min / 12 * 6 - this.min * 6);

		/*
		 * 60-->360 1-->6 5-->60 1-->12
		 *
		 */

	}

}