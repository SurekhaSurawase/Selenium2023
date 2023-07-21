package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		//Thorw keyword is used to add userdefined exceptions
		//We can  only one declaration using throw
		//throw keyword is added in try block
		//it is follwed by new keyword.
		
		
		System.out.println("Throw keyword usage");
		
		try {
			throw new Exception("Exception1");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
