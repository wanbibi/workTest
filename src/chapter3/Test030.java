package chapter3;

/**
 * 选择排序
 * 
 * @author wan.z.c
 *
 */
public class Test030 {
	public static void main(String[] args) {
		int array[] = {22,44,65,74,93,16,35 };
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j-1] > array[j]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}

			}
		}
		for (int i : array) {
			System.out.print(i+",");
			
		}
	}
}
