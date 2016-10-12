package chapter6;

import java.util.ArrayList;
import java.util.List;


public class Test {
	public static void main(String[] args) {
		List<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(8, "22", 23));
		arrayList.add(new Employee(4, "22", 23));
		arrayList.add(new Employee(4, "22", 23));
		arrayList.add(new Employee(2, "22", 23));

		System.out.println("before");
		for (Employee employee : arrayList) {
			System.out.println(employee);
		}
		System.out.println("after");
		java.util.Collections.sort(arrayList);
		for (Employee employee : arrayList) {
			System.out.println(employee);
		}

	}

}
