package chapter3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * for循环排序
 * 
 * @author wan.z.c
 *
 */
public class Test029 {
	public static void main(String[] args) {
		int[] a = { 0, 0, 0 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入整数 空格分开");
		scanner.close();
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		Arrays.sort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
