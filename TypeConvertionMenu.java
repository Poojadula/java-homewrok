import java.util.Scanner;
class TypeConvertionMenu
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n Type Convertion Menu ");
			System.out.println("1. int -> double");
			System.out.println("2. double -> int");
			System.out.println("3. char -> int");
			System.out.println("4. int -> char");
			System.out.println("5. Exit ");
			System.out.println(" Enter Your Choice");
			
			
			choice = sc.nextInt();
			switch (choice)
			{
				case 1:
				    System.out.print("Enter an integer value: ");
					int intValue = sc.nextInt();
					double doubleValue = intValue;
					System.out.println("Converted double value: " + doubleValue);
					break;
					
				case 2: 
			    	System.out.print(" Enter the Double value: ");
				    double dValue = sc.nextDouble();
				    int iValue = (int) dValue;  // Explicit casting
				    System.out.println("Convert int value: " + iValue);
				    break;
				
				
				case 3:
				      System.out.print("Enter a Character ");
					  char ch = sc.next().charAt(0);
					  int asciiValue = ch; // Implicit casting
					  System.out.println("ASCII value (int)" + asciiValue);
					  break;
					  
					  
				case 4:
				      System.out.print("Enter an integer (ASCII value): ");
					  int num = sc.nextInt();
					  char character = (char) num; // Explicit casting
					  System.out.println("Converted character: " + character);
					  break;
					  
				case 5:
				     System.out.println(" Exiting program");
					 break;
					 
				default:
				     System.out.println("Invalid choice please try again");
			
					  
			}
 
			
		}      while(choice != 5);
		
		      sc.close();
		
	}
}