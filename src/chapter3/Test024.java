package chapter3;
/**
 * 求数组最大最小值
 * @author wan.z.c
 *
 */
public class Test024 {
	public static void main(String[] args) {

		int array[] = { -2, -345, 3214, 23, 13, 64, 23, 55, 67, 13, 52, 97, 94 };
		int max = array[0];
		int min = array[0];
		for (int a : array) {
			if (a > max) {
				max = a;
			}
			if (a < min) {
				min = a;
			}
		}
		System.out.println("max=" + max + ", min=" + min);
	}
}
