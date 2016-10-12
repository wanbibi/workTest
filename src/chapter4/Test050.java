package chapter4;

import java.util.Scanner;

/**
 * 判断网页请求
 * 
 * @author wan.z.c
 *
 */
public class Test050 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String next = scanner.next();
		scanner.close();
		boolean iswangye = next.startsWith("http");
		boolean isFTP = next.endsWith("ftp");
		if (iswangye) {
			show("网页");
		}
		if (isFTP) {
			show("ftp");
		}
	}

	private static void show(String string) {
		System.out.println(string);
	}
}
