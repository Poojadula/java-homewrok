import java.util.Scanner;
class Bookshop
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Read 'n' Feed");
		System.out.println("1. Academic Books");
		System.out.println("2. Story Books");
		System.out.println("3. Magazines");
		System.out.println("4. Comeptitve Books");
		System.out.println("5. Comics");
		System.out.print("Enter your choice");
		
		int choice = sc.nextInt();
		
		if(choice==1)
		{
		  System.out.println("1. Maths Book");
		  System.out.println("2. Science Book");
		  System.out.println("Enter your option");
		  
		  int option = sc.nextInt();
		  if(option==1)
		  {
			System.out.println("Maths Book Price-Rs.150");
		  }
		  else if(option==2)
		  {
			  System.out.println("Science Book Price-Rs.200");
		  }
		  else
		  {
			  System.out.println("This Book Not Available");
		  }
			
		}	
		else if(choice==2);
		{
			System.out.println("1. Adventure Story");
			System.out.println("2. Moral Story");
			System.out.println("Enter your option");
			
			int option = sc.nextInt();
			if(option==1)
			{
			System.out.println("Adventure Story Book Price-Rs.150");
		  }
		  else if(option==2)
		  {
			  System.out.println("Moral Story Book Price-Rs.200");
		  }
		  else
		  {
			  System.out.println("This Book Not Available");
		  }
		}
			else if(choice==3);
		{
			System.out.println("1. Weekly Magazines");
			System.out.println("2. Monthly Magazines");
			System.out.println("Enter your option");
			
			int option = sc.nextInt();
			if(option==1)
			{
			System.out.println("Weekly Magazines Price-Rs.100");
		  }
		  else if(option==2)
		  {
			  System.out.println("Monthly Magazines Price-Rs.300");
		  }
		  else
		  {
			  System.out.println("This Book Not Available");
		  }
		}
			
			else if(choice==4);
		{
			System.out.println("1. Banking Exam Books");
			System.out.println("2. SSC Exam Book");
			System.out.println("Enter your option");
			
			int option = sc.nextInt();
			if(option==1)
			{
			System.out.println("Banking Exam Book Price-Rs.600");
		  }
		  else if(option==2)
		  {
			  System.out.println("SSC Exam Book Price-Rs.800");
		  }
		  else
		  {
			  System.out.println("This Book Not Available");
		  }
		}
			
			else if(choice==5);
		{
			System.out.println("1. Kids Comics");
			System.out.println("2. Superhero Comics");
			System.out.println("Enter your option");
			
			int option = sc.nextInt();
			if(option==1)
			{
			System.out.println("Kids Comics Book Price-Rs.150");
		  }
		  else if(option==2)
		  {
			  System.out.println("Superhero Comics Book Price-Rs.100");
		  }
		  else
		  {
			  System.out.println("This Book Not Available");
		  }
		}
			
			}
				
			
			
			
			
			
			
			
			
			
			
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	


			