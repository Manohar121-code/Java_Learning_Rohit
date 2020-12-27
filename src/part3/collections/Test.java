package part3.collections;

import java.util.Collection;

public class Test<T extends Collection> {
	T obj;

	public Test(T obj) {
		this.obj = obj;
	}
	
	public T getObject() {
		return obj;
	}
	
	public Integer getSize() {
		return obj.size();
	}
}
