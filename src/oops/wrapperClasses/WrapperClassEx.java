package oops.wrapperClasses;

public class WrapperClassEx {
	public static void main(String[] args) {
		int i = 10;
		Integer iObj = new Integer(i);
		int i2 = iObj;
		
		System.out.println(i);
		System.out.println(iObj);
		System.out.println(i2);
	}
}
