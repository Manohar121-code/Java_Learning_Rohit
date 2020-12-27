package oops.singleton;

public class Employee {
	private int id;
	private String name;
	
	private static Employee obj;

	private Employee() {

	}
	
	public static Employee getInstance() {
		if (obj == null) {
			obj = new Employee();
		}
		return obj;
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

}
