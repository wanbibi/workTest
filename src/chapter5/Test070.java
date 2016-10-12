package chapter5;

import java.util.Scanner;

/**
 * 汉诺塔
 * 
 * @author wan.z.c
 *
 */
public class Test070 {
	public static void main(String[] args) {
		int nDIsks = 3;
		moveDish(nDIsks, 'A', 'B', 'C');
	}

	private static void moveDish(int level, char 开始, char inter, char 终点) {
		if (level == 1) {
			System.out.println("从 " + 开始 + "移动一号" + 终点);
		} else {
			moveDish(level - 1, 开始, 终点, inter);
			System.out.println("从 " + 开始 + "移动" + level + "到" + 终点);
			moveDish(level - 1, inter, 开始, 终点);
		}

	}

}
