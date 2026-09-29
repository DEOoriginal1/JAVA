import java.util.Scanner;
public class BarChartPrinting{
  public static void main(String... args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number: ");
    int numberOne = input.nextInt();
    
      for (int index = 1; index <= numberOne; index++){
      System.out.print('*'); 
    }
      for (int i = 1; i <= 5; i++){
      System.out.print('*'); 
    }
  }
}
