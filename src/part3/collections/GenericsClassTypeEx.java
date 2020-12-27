package part3.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsClassTypeEx {
	public static void main(String[] args) {
//		Test<Integer> obj = new Test<Integer>(10);
//		Integer object = obj.getObject();
		
//		Test<String> obj new Test<>(obj)
		
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		Test<List<Integer>> listObj = new Test<>(arrayList);
		Integer size = listObj.getSize();
		System.out.println(size);
	}
}
