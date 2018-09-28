package chap3examples;
 
/*
 * Ailsa Mensinger
 * 9-28-18
 */

public class ClockProject {

	public static void main(String[] args) {
	
		
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds/100;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds/60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes/60;
		long currentHour = totalHours % 24;
		
		System.out.println("The current second is " + currentSecond);
		System.out.println("The current minute is " + currentMinute);
		System.out.println("The current hour is " + currentHour); 
		
		
		

	}

}
