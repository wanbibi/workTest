package chapter2;

import java.util.Scanner;

/**
 * 个人所得税计算器
 * 
 * @author wan.z.c
 *
 */
public class test014 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入扣除五险一金以后的工资");
		int money = scanner.nextInt();
		if (money <= 3500) {
			System.out.println("不需要缴纳所得税");
		} else if (0 < money - 3500 && money - 3500 <= 1500) {
			System.out.println("缴纳" + ((money - 3500) * 0.03));
		} else if (1500 < money - 3500 && money - 3500 <= 4500) {
			System.out.println("缴纳" + ((money - 3500) * 0.1 - 105));
		} else if (4500 < money - 3500 && money - 3500 <= 9000) {
			System.out.println("缴纳" + ((money - 3500) * 0.2 - 555));
		} else if (9000 < money - 3500 && money - 3500 <= 35000) {
			System.out.println("缴纳" + ((money - 3500) * 0.25 - 1005));
		} else if (35000 < money - 3500 && money - 3500 <= 55000) {
			System.out.println("缴纳" + ((money - 3500) * 0.3 - 2755));
		} else if (55000 < money - 3500 && money - 3500 <= 80000) {
			System.out.println("缴纳" + ((money - 3500) * 0.35 - 5505));
		} else if (80000 < money - 3500) {
			System.out.println("缴纳" + ((money - 3500) * 0.45 - 13505));
		}
	}
}
