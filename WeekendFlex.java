public class WeekendFlex{
  public static void main(String[] args){
  System.out.println(maximum(2,3));
  System.out.println(isEven(8));
  System.out.println(isPrimeNumber(97));
  System.out.println(subtract(7,9));
  System.out.println(divide(7,9));
  System.out.println(factorOf(7));
  System.out.println(isPerfectSquare(36));
  System.out.println(isPalindrome(123454321));
  System.out.println(factorialOf(1234453));
  System.out.println(squareOf(1234));
  
  
  
  
  
  
  }
  public static int maximum(int numberOne, int numberTwo){
    if(numberOne > numberTwo)
    return numberOne;
  else return numberTwo;
  
  }
  
  public static boolean isEven(int number){
    if(number % 2 == 0)
    return true;
    else return false;
  
  }
  
  public static boolean isPrimeNumber(int number){
    
    int factors = 0;
    for(int index = 1; index <= number; index++){
          if (number % index == 0)
                    factors++;
  }
      if (factors == 2){
      return true;
      }
      return false;
  }
  
public static int subtract(int numberOne, int numberTwo){
 if(numberOne > numberTwo)
  return numberOne - numberTwo;
  else return numberTwo - numberOne;
  }
  
public static float divide(int numberOne, int numberTwo){
    if (numberTwo == 0) return 0;
    return (float) numberOne / numberTwo;
 }
 
public static int factorOf(int number){
  int count = 0;
  for(int index = 1; index <= number; index++){
      if(number % index == 0)
          count++;
          }
          return count;
}
 public static boolean isPerfectSquare(int number){
  for(int index = 1; index <= number; index++){
    if(index * index == number)  return true;
    if(index * index > number)  return false;
}      
      return false;
 }  

public static boolean isPalindrome(int number){
  int normal = number;
  int reverse = 0;
  while(number > 0){
    int digit = number % 10;
    reverse = reverse * 10 + digit;
    number /= 10;
}
    return normal == reverse;
}
 
public static long factorialOf(int number){
    int factorial = 1;
  for(int index = 1; index <= number; index++){
        factorial *= index;
        }
        return (long)factorial;
  }
  
public static long squareOf(int number){
  return (long) number * number;
 
 }
 
 
}
