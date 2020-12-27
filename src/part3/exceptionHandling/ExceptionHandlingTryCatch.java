package part3.exceptionHandling;

public class ExceptionHandlingTryCatch {
	public static void main(String[] args) {
		System.out.println("main started");
		String s = "";
		try {
			char ch = s.charAt(2);
			System.out.println(ch);
		} catch (NullPointerException e) {
			System.out.println("catched null exception - "+ e);
		} catch (ArithmeticException e) {
			System.out.println("catched arithmetic exception - "+ e);
		} finally {
			System.out.println("I'm executed for sure");
		}
		
		System.out.println("execute this");
		System.out.println("execute this");
		System.out.println("execute this");
		System.out.println("execute this");
		System.out.println("execute this");
	}
}
