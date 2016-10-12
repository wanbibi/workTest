package chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 判断是否为闰年（被4除，不被100除，被400除）
 * 
 * @author Administrator
 *
 */
public class test011 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份");
		try{
		long nextLong = scanner.nextLong();
		if (nextLong % 4 == 0 && nextLong % 100 != 0 || nextLong%400 == 0) {
			System.out.println("闰年");
		}else{
			System.out.println("非闰年");
		}
		}catch(InputMismatchException ime){
			System.out.println("输入的不是数字");
			ime.printStackTrace();
		}
	}
}
