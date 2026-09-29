public class Assumptions{
  public static void main(String... args){
  
    int numberOne = 2;
    int numberTwo = 3;
    int numberThree = 2;
    int numberFour = 2;
    
    System.out.println(numberOne == 2);
    System.out.println(numberTwo == 5);
    System.out.println((numberOne >= 2) && (numberTwo <= 3));
    System.out.println((numberFour <= 100) & (numberThree <= numberFour));
    System.out.println((numberTwo >= numberOne) || (numberThree != numberFour));
    System.out.println((numberThree + numberOne < numberTwo) | (4 - numberTwo >= numberThree));
    System.out.println(!(numberThree > numberTwo));
   }
}
