package chapter4;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;

public class Test045 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String number = scanner.next();
		scanner.close();

			NumberFormat formatCN = NumberFormat.getCurrencyInstance(Locale.CHINA);
			System.out.println(formatCN.format(number));
			
			
			NumberFormat formatUS = NumberFormat.getCurrencyInstance(Locale.US);
			System.out.println(formatUS.format(number));
			
			
			NumberFormat formatENG = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
			System.out.println(formatENG.format(number));
		
		
	}
}
