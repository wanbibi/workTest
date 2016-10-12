package chapter9;

import java.util.*;

/**
 * Created by Administrator on 16.10.11.
 */
public class Main {
    public static void print(int index, Object o) {
        System.out.println(String.format("{%d}, %s", index, o.toString()));
    }

    public static void demoString() {
        String str = "asfsdafe";
        print(1, str.indexOf('e'));
        print(2, str.charAt(3));
        print(3, str.codePointAt(1));
        print(4, str.compareToIgnoreCase("as"));
        print(5, str.contains("asf"));
        print(6, str.contains("!!!"));
        print(7, str.toUpperCase());
        print(8, str.endsWith("e"));
        print(9, str.replace("2", "fuck"));
        print(9, str.replaceAll("2|45", "fuck"));

        StringBuilder sb = new StringBuilder();
        sb.append(2);
        sb.append(true);
        print(10, sb);
    }

    public static void H() {
  /*      String string = "b";
        switch (string){
            case "a":
                print(1,"a");
                break;
            case "b":
                print(2, "b");
                break;
            default:
                print(3,"unknow");
                break;
        }*/


    }

    private static void demoList() {
        List<String> strList = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            strList.add(String.valueOf(i));
        }
        System.out.println(strList);
        List<String> strListB = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            strListB.add(String.valueOf(i));
        }
        strList.addAll(strListB);
        System.out.println(strList);

        strList.remove(0);
        System.out.println(strList);

        strList.remove(String.valueOf(3));
        System.out.println(strList);

        Collections.reverse(strList);
        print(1, strList);

        Collections.sort(strList);
        print(7, strList);

        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(8, strList);

        for (String obj : strList) {
            System.out.println(obj);
        }

        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr[2]);
    }

    public static void mapDemo() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            map.put(String.valueOf(i), String.valueOf(i * i));
        }
        System.out.println(map);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
        print(3, map.values());
        print(4, map.keySet());
        print(5, map.get("3"));
        print(6, map.containsKey("4"));

    }

    public static void setDemo() {
        HashSet<String> strSet = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            strSet.add(String.valueOf(i));
        }

        System.out.println(strSet);

        System.out.println(strSet.size());

        System.out.println(strSet.contains(String.valueOf(3)));

        strSet.addAll(Arrays.asList(new String[]{"2", "b", "c"}));

        System.out.println(strSet);
    }


    public static void main(String[] args) {
        // demoList();
        setDemo();
    }
}
