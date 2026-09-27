import java.util.Scanner;
public class PrintNumbers{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int number = input.nextInt();
  
  int count = 0;
  while(count < number){
      count++;
  System.out.println(count);
  }
  
  }




}
