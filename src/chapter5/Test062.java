package chapter5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Scanner;

/**
 * 查看类的申明
 *
 * @author wan.z.c
 */
public class Test062 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.util.UUID");

        System.out.println(clazz.getCanonicalName());
        System.out.println(Modifier.toString(clazz.getModifiers()));

        TypeVariable<?>[] typeParameters = clazz.getTypeParameters();
        System.out.println("类的泛型参数");
        for (TypeVariable<?> typeVariable : typeParameters) {
            System.out.println(typeVariable);
        }
        System.out.println("类所有实现的接口");
        Type[] genericInterfaces = clazz.getGenericInterfaces();
        for (Type type : genericInterfaces) {
            System.out.println(type);
        }
        System.out.println("直接继承的");
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
        Annotation[] annotations = clazz.getAnnotations();
        System.out.println("所有注释信息");
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }

}
