package chapter5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Scanner;

/**
 * 查看类的申明
 * 
 * @author wan.z.c
 *
 */
public class Test063 {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("java.util.ArrayList");
		System.out.println("类的标准名臣" + clazz.getCanonicalName());
		Constructor<?>[] constructors = clazz.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println("gouzaofangfa" + constructor);
		}

		String s = "2";
		Class<? extends String> class1 = s.getClass();
		Constructor<?>[] constructors2 = class1.getConstructors();
		if (constructors2 != null) {
			for (Constructor<?> constructor : constructors2) {
				System.out.println(constructors2);

			}
		}
	}

}
