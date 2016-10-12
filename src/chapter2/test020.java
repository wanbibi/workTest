package chapter2;

import java.util.Scanner;

/**
 * 杨辉三角
 * 
 * @author wan.z.c
 *
 */
@SuppressWarnings("resource")
public class test020 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入英文字符串");
		String nextLine = scanner.nextLine();
		String upperCase = nextLine.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);

	}
}
