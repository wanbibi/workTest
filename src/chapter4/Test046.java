package chapter4;

import java.util.Scanner;

public class Test046 {
	public static void main(String[] args) {
		
		Scanner scanner2 = new Scanner(System.in);
		Scanner scanner = scanner2;
		String number = scanner.nextLine();
		scanner.close();
		String lowerCase = number.toLowerCase();
		System.out.println(lowerCase);
		
		
		
		
	}
}
