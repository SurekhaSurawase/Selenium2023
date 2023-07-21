package ExceptionHandling;

public class OutOfMemoryException {

	public static void main(String[] args) {
		System.out.println("out of memory execption");
		int num = 100;
		while(true) {
			num=num+1;
			//System.out.println(num);
		}
	}

}
