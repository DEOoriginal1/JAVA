import java.util.Scanner;
public class MinimumAndMaximum{
	public static void main( String[] args ){
	Scanner inputtaker = new Scanner(System.in);
	
	System.out. print("pick a range of number you want: ");
	int number = inputtaker.nextInt();
	
	System.out. print("Okay, now input your preffered numbers: ");
	int numberOne = inputtaker.nextInt();
	
	int maximum = numberOne;
	int minimum = numberOne;
	int sum = 0;
	
	for(int index = 1; index < number; index++){
	System.out. print("Okay, now input your preffered numbers: ");
	 numberOne = inputtaker.nextInt();
	
	if (numberOne > maximum){
	  maximum = numberOne;
	 }
	if (numberOne < minimum){
	  minimum = numberOne;
	}
	sum = maximum + minimum;
	  }
	System.out.println("Maximum number is: " + maximum);
	System.out. println("Minimum number is: " + minimum);
	System.out.println("The total of both extreme is: " + sum);
  }
}
