package part3.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add("honda");
		list.add(new Object());
		
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println("------------------");
		List<String> list2 = new ArrayList<String>();
		list2.add("hyderabad");
		list2.add("bangalore");
		list2.add("chennai");
		for (String s : list2) {
			char charAt = s.charAt(s.length()-1);
			System.out.println(charAt);
		}
	}
}
