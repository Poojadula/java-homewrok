import java.util.Scanner;
class Orderstatus
{
 public static void main(String[] args)	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter order status code (P, S, D, C ): ");
	 char code = sc.next().charAt(0); 
	 switch(code)
	 {
		case 'P':
		{
			System.out.println("Order placed");
			break;
		}
			case 'S':
			{
				System.out.println("Shipped");
				break;
		    }
		 case 'D':
		 {
			 System.out.println("Delivered");
			 break;
		 }
		 case 'C':
		 {
			System.out.println("Cancelled");
			break;
			 
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}