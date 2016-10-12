package chapter5;

import java.lang.reflect.Method;

/**
 * 动态调用类的方法
 * 
 * @author wan.z.c
 *
 */
public class Test066 {
	public static void main(String[] args) throws Exception {
		Method sin = Math.class.getDeclaredMethod("sin", Double.TYPE);
		Double sin1 = (Double) sin.invoke(null, new Integer(2));
		System.out.println(sin1);

		Method equals = String.class.getDeclaredMethod("equals", Object.class);
		boolean invoke = (boolean) equals.invoke(new String("java"), "java");
		show(invoke);

	}

	private static void show(boolean invoke) {
		if (invoke) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
