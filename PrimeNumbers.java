public class PrimeNumbers{
    public static void main(String[] args){ 
    int count = 0;
for(int dividend = 1; dividend <= 100; dividend++){
          int index = 0;
      for(int divisor = 2; divisor <= dividend; divisor++){
            if(dividend % divisor == 0){           
                index++;  
               
}
}

           if(index == 1){
          System.out.println(dividend);
          count++;
}          
}
             
           System.out.println("The number of prime numbers between 1 and 100 is: " + count); 
}
}



