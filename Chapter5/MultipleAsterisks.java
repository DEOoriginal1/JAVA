public class MultipleAsterisks{

	public static void main(String[] args) {

		for(int index = 1; index <= 10; index++) {
		
			for(int count = 1; count <= index; count++) {
				System.out.print("*");						
			}
			for(int counter = 10; counter >= index; counter--) {
				System.out.print(" ");
			}
			for(int star = 10; star >= index; star--) {
				System.out.print("*");
			}
			for(int space = 1; space <= index; space++) {
				System.out.print(" ");
 			}
 			for(int spacer = 1; spacer <= index; spacer++) {
 				System.out.print(" ");
 			}
 			for(int stars = 10; stars >= index; stars--) {
 				System.out.print("*");
 			}
 			for(int spaces = 10; spaces >= index; spaces--) {
 				System.out.print(" ");
 			}	
 			for(int lastStar = 1; lastStar <= index; lastStar++) {
 				System.out.print("*");
 			}
			System.out.println("");
		}

 	}
 
}


