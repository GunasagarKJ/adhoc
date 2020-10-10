package angleOnClock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AngleOnClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		try{
		Time t= new Time(sc.nextInt(),sc.nextInt());
		}
		catch(InputMismatchException e){
			System.out.println("Enter an integer");
		}
		
		
		
	}

}

class Time{
	private int hr;
	private int min;
	
	public Time(int a,int b){
		hr=a;
		min=b;
	}	
	
	public int getValueHr(){
		return hr;
	}
	
	public int getValueMin(){
		return min;
	}
	
	public void assignTime(int a, int b){
		hr=a;
		min=b;
	}

	public void assignTime(int a){
		hr=a;
		min=0;
	}
	
	public int getTime(){
		
		return abs(this.hr*5*6+this.min/12*6-this.min*6);
		
		/*
		 *60-->360
		 *1-->6
		 *5-->60
		 *1-->12 
		 * 
		 * 
		 *
		 */
		return 0;
	}

}