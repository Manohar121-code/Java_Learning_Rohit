package part3.multiThreading;

public class MultiThreadingEx {
	public static void main(String[] args) {
		System.out.println("Main started--------------"+ Thread.currentThread().getName());
		
		Employee e1 = new Employee(10, "Sachin");
		
		MyThread obj = new MyThread(e1);
		obj.setName("T1");
		obj.start();
		MyRunnable myRunnable = new MyRunnable(e1);
		Thread obj2 = new Thread(myRunnable);
		obj2.setName("T2");
		obj2.start();
		System.out.println("Main stopped--------------"+ Thread.currentThread().getName());
	}
}
