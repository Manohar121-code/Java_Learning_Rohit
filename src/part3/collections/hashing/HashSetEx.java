package part3.collections.hashing;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Rohit", 23, 87676);
		Employee e2 = new Employee(2, "Manohar", 27, 65668);
		Employee e3 = new Employee(1, "djhdbjf", 23, 87676);
		
		Set<Employee> set = new HashSet<Employee>();
		set.add(e1); //10
		set.add(e2); //11
//		set.add(e2); //11
		set.add(e3); //10
		
		System.out.println(set.size());
		
		boolean contains = set.contains(e3);
		System.out.println(contains);
	}
}
