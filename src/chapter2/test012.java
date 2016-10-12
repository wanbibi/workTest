package chapter2;

import java.util.Scanner;

/**
 * 登陆验证
 * 
 * @author Administrator
 *
 */
public class test012 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入姓名");
		String name = scanner.nextLine();
		System.out.println("请输入密码");
		String pwd = scanner.nextLine();
		if (name.equals("123") && pwd.equals("123")) {
			System.out.println("登陆成功");
		} else {
			System.out.println("密码或姓名错误");
		}
	}
}
