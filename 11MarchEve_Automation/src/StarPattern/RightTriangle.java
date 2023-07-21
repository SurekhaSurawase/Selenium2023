package StarPattern;

public class RightTriangle {

	public static void main(String[] args) {
		System.out.println("Printing right traingle of star pattern");
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				
				if(j>=6-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
