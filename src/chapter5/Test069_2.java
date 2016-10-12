package chapter5;

import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang.math.RandomUtils;

/**
 * 计时器
 * 
 * @author wan.z.c
 *
 */
public class Test069_2 {

	public static void main(String[] args) {
		String[] products = { "java", "python", "html", "php", "andorid", "ruby", "c++" };
		Test069 info = new Test069();
		Test069 info2 = new Test069();
		System.out.println(products.length);
		int time = new Random().nextInt(10);
		for (int i = 0; i < time; i++) {
			info.sale(products[new Random().nextInt(products.length)]);
		}
		System.out.println("一共学习了 " + info.getProductsCount() + " 门课程");
		for (int i = 0; i < time; i++) {
			info2.sale(products[new Random().nextInt(products.length)]);
		}
		System.out.println("一共学习了 " + info.getProductsCount() + " 门课程");
		System.out.println();
		
	}

}
