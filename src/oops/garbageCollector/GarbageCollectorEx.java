package oops.garbageCollector;

public class GarbageCollectorEx {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = e1;
		e1 = null;
		System.gc();
		System.gc();
	}
}
