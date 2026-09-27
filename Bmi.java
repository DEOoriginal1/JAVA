import java.util.Scanner;
	public class Bmi{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Weight: ");
		int weight = input.nextInt();


		System.out.print("Height: ");
		float height = input.nextFloat();

		
		System.out.println("BMI = " + weight * 703 / height * height);
	}
}

