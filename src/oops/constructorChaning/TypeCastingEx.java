package oops.constructorChaning;

public class TypeCastingEx {
	public static void main(String[] args) {
		Child c1 = new Child();
		Parent p1 = new Parent();
		
		Parent p2 = new Child();
		p2.m1();
		
		if (p2 instanceof Child) {
			Child c3 = (Child) p2;
		}
	}
}
