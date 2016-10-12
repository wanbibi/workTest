package chapter4;

import java.util.Scanner;

import org.apache.commons.lang.math.NumberUtils;

public class Test049 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			String nextLine = scanner.nextLine();
			boolean isNumber = NumberUtils.isNumber(nextLine);
			if (isNumber) {
				showDialog("yes");
			} else {
				showDialog("no");
			}

		}

	private static void showDialog(String string) {
		if (string.equals("yes")) {
			System.out.println("输入的是数字");
		} else {
			System.out.println("不是数字");
		}

	}
}
