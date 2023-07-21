package StarPattern;

public class LeftTriangle {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Printing left triangle of Star pattern");
		
		for(int i = 1; i<=n; i++) {
			
			for(int j = 1; j<=n; j++) {
				
				if(j<=i) {
					System.out.print("*");
				}
				else {
					System.out.print("");
				}		
			}
			System.out.println();
		}

	}

}
