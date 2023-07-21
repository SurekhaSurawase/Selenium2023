package StarPattern;

public class Pyramid {

	public static void main(String[] args) {
		
		System.out.println("Printing pyramid of * pattern");
		
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=9; j++) {
				if(j>=6-i && j<=4+i) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
