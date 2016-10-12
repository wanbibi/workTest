package chapter2;

import java.util.Scanner;

/**
 * 判断季节 
 * @author wan.z.c
 *
 */
public class test016 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = scanner.nextInt();
		switch (month) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("spring");
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("winter");
			break;
		default:
			System.out.println("no such month!");
			break;
		}
	}
}
