package day03.misc;

import java.time.LocalDateTime;


public class Logger {
	

	
	public static void info(String message) {
		System.out.println(message);
	}
	
	
	public static void debug(String message) {
		LocalDateTime datetime = LocalDateTime.now();
			
		System.out.print(datetime.toString().concat(message));
		
	}
}