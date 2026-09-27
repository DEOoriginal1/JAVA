import java.util.Scanner;

public class Nokia{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

String menuFunctions = """

Welcome

Press

1  Phone-Book
2  Messages
3  Chat
4  Call Register
5  Tones
6  Settings
7  Call Divert
8  Music
9  Games
10 Calculator
11 Reminders
12 Clock
13 Profiles
14 Services
15 SIM services

""";


		System.out.println(menuFunctions);
//		System.out.print("Enter Phone-Book: ");
		int phone_book = input.nextInt();

		switch(phone_book){
			case 1 -> {System.out.println("Phone-Book");  
String phoneBook = """

1  Search
2  Service Nos.
3  Add name
4  Erase
5  Edit
6  Copy
7  Assign tone
8  Send b'card
9  Options
10 Speed dials
11 Voice tags

""";
			System.out.println(phonebook);
			int options = input.nextInt();
			switch(options){

			case 1 -> System.out.println("Memory in use"); 
			case 2 -> System.out.println("Type of view"); 
			case 3 -> System.out.println("Memory status");
			default -> System.out.println("Try again........");
			}
			}
			
			switch(messages){
			case 2 -> {System.out.println("Messages"); 
String messages = """

1 Write messages
2 Inbox
3 Outbox
4 Picture messages
5 Templates
6 Smileys
7 Message settings
8 Info service
9 Voice mailbox number
10 Service command editor

""";
    System.out.println(messages);
//      System.out.print(message_settings);
			int message_settings = input.nextInt();
			
			switch(message_settings){
			
			case 1 -> System.out.println("Set 1"); 
			case 2 -> System.out.println("Common"); 
			default -> System.out.println("Try again........");
				
			
			case 1 -> {System.out.println("Set 1"); 
String message = """

1 Message Centre Number
2 Messages
3 Message Validity

""";
  case 2 -> {System.out.println("Common"); 
      
String phoneBook = """

1  Search
2  Service Nos.
3  Add name

""";
}
}
}
}
}
    System.out.print("Call register: ");
		int call_register = input.nextInt();

		switch(call_register){
			case 3 -> {System.out.println("Call Register");  
String call_register = """

1  Missed calls
2  Received calls
3  Dialled numbers
4  Erase recent call lists
5  Show call duration
6  Show call costs
7  Call cost settings
8  Prepaid credit

""";
			
		switch(show_call_duration){
	    case 1 -> {System.out.println("Show call duration");  
String show_call_duration = """

1  Last call duration
2  All calls' duration
3  Received calls' duration
4  Dialled calls' duration
5  Clear times

""";
}
	}	
	
	switch(show_call_costs){
	    case 2 -> {System.out.println("Show call costs");  
String show_call_costs = """

1  Last call costs
2  All calls' cost
3  Clear counters

""";
}
	}	
	
	switch(tones){
	    case 4 -> {System.out.println("Tones");  
String tones = """

1  Ringing tone
2  Ringing volume
3  Incoming call alert
4  Message alert tone
5  Keypad tones
6  Warning tones
7  Vibrating alert
8  Screen saver

""";
}
	}	
	switch(settings){
			case 5 -> {System.out.println("Settings");  
String settings = """

1  Call settings
2  Phone settings
3  Security settings
4  Restore factory settings

""";
		}	
		switch(call_settings){
	    case 1 -> {System.out.println("Call settings");  
String call_settings = """

1  Automatic redial
2  Speed dialing
3  Call waiting options
4  Own number sending
5  Phone line in use
6  Automatic answer

""";
	}
	
	switch(phone_settings){
	    case 2 -> {System.out.println("Phone settings");  
String phone_settings = """

1  Language
2  Cell info display
3  Welcome note
4  Network selection
5  Confirm SIM service actions

""";
}

  switch(security_settings){
	    case 3 -> {System.out.println("Security Settings");  
String security_settings = """

1  PIN code request
2  Call barring service
3  Fixed dialling
4  Closed user group
5  Security level
6  Change access codes

""";
}
}
	}
	switch(music){
			case 6 -> {System.out.println("Music");  
String music = """

1  Music player
2  Radio
3  Recorder
4  Track list

""";

switch(clock){
			case 6 -> {System.out.println("Clock");  
String clock = """

1  Alarm clock
2  Clock settings
3  Date setting
4  Stopwatch
5  Countdown timer
6  Auto update of date and time


}
}
}
}
			
			


	//	}

	}

}
