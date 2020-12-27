package part3.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add("Java");
		list.add(new Object());
		for (Object object : list) {
			System.out.println(object);
		}
		
	}
}
