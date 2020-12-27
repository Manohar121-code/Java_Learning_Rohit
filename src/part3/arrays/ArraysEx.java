package part3.arrays;

public class ArraysEx {
	public static void main(String[] args) {
		int[] arr = new int[5];//declaration
		arr[0] = 10;//initialization
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[2]);
		System.out.println(arr[1]);
		
		print(arr);
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
