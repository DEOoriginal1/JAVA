import java.util.Scanner;
public class Extremes{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("How many numbers do you want to enter? ");
  int number = input.nextInt();
  
  System.out.println("Great! Enter " + number + " integers.");
  
  int[] numbers = new int [number];
  
  for(int index = 0; index < number; index++){
      numbers[index] = input.nextInt();
    }
    for(int index = 0; index < numbers.length; index++){
  
  
    }
  
  }
