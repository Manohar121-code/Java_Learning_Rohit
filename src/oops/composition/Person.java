package oops.composition;

public class Person {
	private int id;
	private String name;
	private Heart heart;

	public Person(int id, String name, Heart heart) {
		super();
		this.id = id;
		this.name = name;
		this.heart = heart;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", heart=" + heart + "]";
	}

}
