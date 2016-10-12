package chapter5;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 动态实例化
 * 
 * @author wan.z.c
 *
 */
public class Test067 {
	public static void main(String[] args) throws Exception {
		Constructor<File> declaredConstructor = File.class.getDeclaredConstructor(String.class);
		File file = declaredConstructor.newInstance("d://hihi.txt");
		file.createNewFile();
		System.out.println(file.exists() ? "yes" : "no");
	}

}
