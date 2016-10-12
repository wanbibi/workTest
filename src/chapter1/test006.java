package chapter1;

import java.util.Scanner;

/**
 * 常见字母大小写转换
 * 
 * @author Administrator
 *
 */
public class test006 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
			System.out.println("请输入一个字符串");
			char c = scanner.next().charAt(0);
			char temp;
			if (c >= 'A' && c <= 'Z') {
				temp = (char) (c + 32);
				System.out.println("enter number" + c + " 变成了" + temp);
			} else if (c >= 'a' && c <= 'z') {
				temp = (char) (c - 32);
				System.out.println("enter number" + c + " 变成了" + temp);
			} else {
				System.out.println("输入的不是字符");
			}
		
	}
}
