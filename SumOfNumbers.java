import java.util.Scanner;
public class SumOfNumbers{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int number = input.nextInt();
  
  int count = 0;
  int sum = 0;
  while(count < number){
      count++;
  sum = sum + count;
   }
  System.out.println(sum);
  }
}
