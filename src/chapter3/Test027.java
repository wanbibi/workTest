package chapter3;

/**
 * 1，2，3，4不重复4位数
 * 
 * @author wan.z.c
 *
 */
public class Test027 {
	public static void main(String[] args) {
		int[] a = { 5, 6, 7, 8 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (j == i) {
					continue;
				}
				for (int h = 0; h < a.length; h++) {
					if (h == i || h == j) {
						continue;
					}
					for (int k = 0; k < a.length; k++) {
						if (k == i || k == j || k == h) {
							continue;
						}
						for (int g = 0; g < a.length; g++) {
							if (g == i || g == j || g == h || g == k) {
								System.out.print(a[j] * 1000 + a[h] * 100 + a[k] * 10 + a[g] + ",");
								count+=1;
							}
						}
					}
				}
			}
		}
		System.out.println("共有"+count+"不重复的组合");
	}
}
