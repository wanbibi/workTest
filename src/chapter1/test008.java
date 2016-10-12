package chapter1;

import java.util.Scanner;

/**
 * 加密或解密
 * 
 * @author Administrator
 *
 */
public class test008 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符串");
		String password = scanner.next();
		char[] charArray = password.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = (char) (charArray[i] ^ 20000);
		}
		System.out.println(charArray);
	}

}
