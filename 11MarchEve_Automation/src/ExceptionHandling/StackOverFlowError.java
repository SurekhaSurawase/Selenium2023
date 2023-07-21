package ExceptionHandling;

public class StackOverFlowError {

	public static void main(String[] args) {
		m1();
		System.out.println("completed");
	}
	
	public static void m1() {
		m2();
	}
	public static void m2() {
		m3();
	}
	public static void m3() {
	
		int num = 100;
		System.out.println(num);
	}

}
