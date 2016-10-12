package chapter4;

import java.util.Date;
import java.util.Locale;


public class Test048 {
	public static void main(String[] args) {
		
		Date date = new Date();
		String format = String.format(Locale.CHINA, "%tb", date);
		System.out.println(format);

	
	}
}
