package chapter6;

import java.util.ArrayList;

/**
 * 便利list
 *
 * @author wan.z.c
 */
public class Test084 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        for (int i = 1; i < arrayList.size(); i += 2) {
            System.out.println(arrayList.get(i));
        }
    }
}
