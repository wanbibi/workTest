package chapter2;

import java.math.BigDecimal;

/**
 * 计算阶乘
 * 
 * @author wan.z.c
 *
 */
public class test019 {
	public static void main(String[] args) {
		BigDecimal sum = new BigDecimal(0.0);
		BigDecimal factorial = new BigDecimal(1.0);
		int i = 1;
		while (i < 10) {
			sum = sum.add(factorial);
			++i;
			factorial = factorial.multiply(new BigDecimal(1.0 / i));
		}
		System.out.println(sum);
	}
}
