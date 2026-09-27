import java.util.Scanner;
public class LargestOfThree{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Ask for an Integer: ");
    int integer1 = input.nextInt();

    System.out.print("Ask for an Integer: ");
    int integer2 = input.nextInt();


     System.out.print("Ask for an Integer: ");
    int integer3 = input.nextInt();


    int largest = integer1;

    if (integer2 > largest)
        largest = integer2;

    if (integer3 > largest)
        largest = integer3;

    System.out.println("Largest is " + largest);

}





}
