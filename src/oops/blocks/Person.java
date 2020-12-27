package oops.blocks;

public class Person {
	private int id;
	private String name;
	static {
		System.out.println("static block is called!!!");
	}
	
	{
		System.out.println("non static block called!!!");
	}
	
	public static void main(String[] args) {
		System.out.println("main method called!!!");
	}
	
}
