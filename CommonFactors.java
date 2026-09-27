import java.util.Scanner;
public class Primefactor{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
         int count = 0;
     
      while(count <= number){
              count++;
      if(number % count == 0)
         System.out.printf("%d%n" , count);
}          

}

}


