public class Exercise{
public static void main(String[] args){

int number = 1;
while (number <= 20){
System.out.print(number);

if (number % 5 == 0) {
System.out.println();
}
else {
System.out.print('\t');
}
++number;
}
}
}
