package chapter1;

import java.util.Scanner;

/**
 * 判断数字奇偶
 * 
 * @author Administrator
 *
 */
public class test007 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int nextInt = scanner.nextInt();
		String yesorno = nextInt % 2 == 0 ? "yes" : "no";
		System.out.println(yesorno);

	}

}
