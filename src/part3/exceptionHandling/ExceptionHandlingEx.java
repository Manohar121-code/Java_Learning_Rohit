package part3.exceptionHandling;

import java.io.FileNotFoundException;

import part3.collections.hashing.Employee;

public class ExceptionHandlingEx {
	public static void main(String[] args) {
		String s = null;
//		char charAt = s.charAt(2);
//		System.out.println(charAt);

		try {
			int divide = divide(10, 0);
			System.out.println(divide);
		} catch (ArithmeticException e) {
			System.out.println("exception occured - " + e.getMessage());
		} catch (FileNotFoundException e1) {
			System.out.println("FileNotFoundException occured - " + e1.getMessage());
		}

		divide2(); // unchecked exception
		Employee e = new Employee(1, "hsgdh", 26, 7767);
		sample(e);
	}

	private static void divide2() throws ArithmeticException {
		// TODO Auto-generated method stub

	}

	private static int divide(int i, int j) throws FileNotFoundException {
		if (j == 0) {
			throw new FileNotFoundException("j is zero");
		}
		return i / j;
	}

	public static void sample(Employee e) {
		if (e == null) {
			System.out.println("you sent null object");
			return;
		}
		System.out.println(e.getAge());
	}
}
