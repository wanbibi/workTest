package chapter5;

import java.util.Scanner;

/**
 * 温度计转换
 * 
 * @author wan.z.c
 *
 */
public class Test068 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Long number = (long) scanner.nextInt();
		long anotherNumber = convert(number);
		System.out.println(anotherNumber);
	}

	private static long convert(Long number) {
		return number + 459;

	}
	

}
