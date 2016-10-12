package chapter2;

import java.util.Scanner;

/**
 * 你的公司有多少奖金
 * 
 * @author wan.z.c
 *
 */
public class test015 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入利润（万）");
		double money = scanner.nextFloat();
		double bonus = 0;

		if (money < 10) {
			bonus = money * 0.1;
		} else if (money < 20) {
			bonus = (money - 10) * 0.075 + 1;
		} else if (money < 40) {
			bonus = (money - 20) * 0.05 + 0.75 + 1;
		} else {
			bonus = 10;
		}
		System.out.println("奖金为" + bonus +"万");
	}
}
