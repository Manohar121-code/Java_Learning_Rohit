package oops.singleton;

public class MainEx {
	public static void main(String[] args) {
		Employee e1 = Employee.getInstance();
		Employee e2 = Employee.getInstance();
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
