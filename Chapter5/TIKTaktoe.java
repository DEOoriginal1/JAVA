import java.util.Scanner;
public class TikTakToe{
  public static void main(String... args){
  Scanner input = new Scanner(System.in);

  char[][] board = new char[3][3];     
 
        
  for(int row = 0; row < 3; row++){
    for(int column = 0; column < 3; column++){
        System.out.print("Select X or O: " + "|");
        board[row][column] = input.next().charAt(0);
      }
    }
    
  }
}
