import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = input.nextInt();
    int factorial = number - 1;

    
    while(factorial >= 1){
     number = number * factorial;
       factorial--;
      
      
}
    System.out.println(number);
}

}
