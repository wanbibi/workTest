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
public class Test064 {
	public static void main(String[] args) throws Exception {
		Class<?> forName = Class.forName("java.awt.geom.Point2D");
		Class<?>[] classes = forName.getDeclaredClasses();
		for (Class<?> class1 : classes) {
			System.out.println("类的标准名称" + class1.getCanonicalName());
			System.out.println("修饰符" + Modifier.toString(class1.getModifiers()));
			Type superClass = class1.getGenericSuperclass();
			System.out.println(superClass);
		}
		

	}

}
