package ExceptionHandling;

public class Throwskeyword {

	public static void main(String[] args) {
		int num=100;
		try {
			num=100/0;
		}
		catch(ArithmeticException Exception) {
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		}
		finally {
			System.out.println("Handled Execption");
		}

	}

}
