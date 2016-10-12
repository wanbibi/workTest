package chapter5;

import java.util.Scanner;

/**
 * 计时器
 * 
 * @author wan.z.c
 *
 */
public class Test069 {
	private static int count;

	public void sale(String product) {
		System.out.println("学习了  "+product);
		count++;
	}

	public int getProductsCount() {
		return count;
	}
	
	

	
}
