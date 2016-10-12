package chapter2;

import java.util.Scanner;

/**
 * 折扣计算
 * 
 * @author wan.z.c
 *
 */
public class test017 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入消费金额");
		double money = scanner.nextInt();
		String zhekou = null;
		if (money >= 200) {
			int grade = (int) (money / 200);
			
			switch (grade) {
			case 1:
				zhekou = "95";
				break;
			case 2:
				zhekou = "85";
				break;
			case 3:
				zhekou = "75";
				break;
			case 4:
				zhekou = "65";
				break;
			case 5:
				zhekou = "55";
				break;
			default:
				zhekou = "对折";
				break;
			}
		}
		System.out.println("折扣为： " + zhekou);

	}
}
