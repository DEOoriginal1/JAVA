public class Exercise5_4{
public static void main(String[] args){

String words = """
5.4 
  a) Error: The semicolon after the while header causes an infinite loop, and there’s a missing left brace.
  Correction: Replace the semicolon by a {, or remove both the ; and the }.

  b) Error: Using a floating-point number to control a for statement may not work, because floating-point numbers are represented only approximately by most computers.
  Correction: Use an integer, and perform the proper calculation to get the values you desire, as in: for (k = 1; k != 10; k++) {
  System.out.println((double) k / 10);
  }

  c) Error: The missing code is the break statement in the statements for the first case.
  Correction: Add a break statement at the end of the statements for the first case. This omission is not necessarily an error if you want the statement of case 2: to execute every time the case 1: statement executes.

  d) Error: An improper relational operator is used in the while’s continuation condition.
  Correction: Use <= rather than <, or change 10 to 11.

  5.5 TO 5.10
  1. Initialization
  2. controlled condition
  3. increment
  4. statement


  5.6 Both loops are used for iteration however the while loop is more effective when we have no idea of the amount of times a process is suppose to run therefore it uses a sentinel, while a for is used when we know the number of times an event is suppose to occur which is often referred to as counter controlled.

  5.7 In this instance a do-while is more effective since we already understand that for a do-while it runs the body at least once before checking the condition.

  5.8 The break statement ends a statement or an iteration while continue skips the aspect where it is being called and moves to the next iteration or statement.

  5.9 
  a). so instead of i+ it should be i++ for the increment the code be something like this while (i = 1; i <= 10, i++)
	  System.out.println(i);

  b).


  c). i think that the increment should be 1-- since are trying to do a count down from 19 -1, therefore the code should look like this 
	  for (int i = 19; i > 1; i--)
	  System.out.println(i);
	  
  d). the question for numbers in range 1 - 50 but the condition here give us numbers from 1 - 51 there the fix should like this.
	  counter = 0;
	  do {
	  System.out.println(counter + 1);
	  counter += 2;
	  } while (counter <= 50);
	  
  5.10
  it prints * four times and # 5 times
                                 
""";
System.out.print(words);
 
}
}
