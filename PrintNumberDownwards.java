import java.util.Scanner;
public class PrintNumberDownwards{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int number = input.nextInt();
  
for (int index = number; index >= 1; index--) {
            System.out.println(index);
    }

  }
}
