package chapter2;

import java.util.Scanner;

/**
 * qq等级活跃天数计算器
 * 
 * @author wan.z.c
 *
 */
public class test013 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入QQ等级");
		int level = scanner.nextInt();
		if (level == 1) {
			System.out.println("活跃5天");
		} else if (level == 4) {
			System.out.println("活跃32天");
		} else if (level == 8) {
			System.out.println("活跃96天");
		} else if (level == 12) {
			System.out.println("活跃192天");
		} else if (level == 16) {
			System.out.println("活跃320天");
		} else if (level == 32) {
			System.out.println("活跃1152天");
		} else if (level == 48) {
			System.out.println("活跃2496天");
		} else if (level == 64) {
			System.out.println("活跃4352天");
		} else {
			System.out.println("没有对应的天数");
		}
	}
}
