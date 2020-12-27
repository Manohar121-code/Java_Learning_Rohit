package part3.multiThreading;

public class MyThread extends Thread {
	
	Employee emp;
	
	public MyThread(Employee emp) {
		this.emp = emp;
	}
	
	@Override
	public void run() {
		String idName = emp.getIdName();
		System.out.println("Thread name - "+ Thread.currentThread().getName() + " & val - " +idName);
	}

//	@Override
//	public void run() {
//		for (int i = 1; i <= 500; i++) {
//			System.out.println("Thread name - "+ Thread.currentThread().getName()+" & i - " + i);
//		}
//	}
}
