package chapter2;

import java.util.Scanner;

/**
 * 招聘程序员
 * 
 * @author wan.z.c
 *
 */
public class test018 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入招聘的编程语言");
		String language = scanner.nextLine();
		switch (language) {
		case "java":
		case "Java":
		case "JAVA":
			System.out.println("被分配到java研发部门");
			break;
		case "c":
		case "C":
			System.out.println("被分配到C研发部门");
			break;
		case "android":
		case "Android":
		case "安卓":
			System.out.println("被分配到Android研发部门");
			break;
		default:
			System.out.println("不需要" + language + "的程序员");
			break;
		}

	}
}
