package oops.composition;

public class MainEx {
	public static void main(String[] args) {
		Heart h1 = new Heart(10, 4, "High");
		
		Person p1 = new Person(10, "sachin", h1);
		
		System.out.println(p1);
		
		Heart heart = p1.getHeart();
		System.out.println(heart.getQuality());
	}
}
