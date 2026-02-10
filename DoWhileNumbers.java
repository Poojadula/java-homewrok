import java.util.Scanner;
class DoWhileNumbers 
{
	public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
	System.out.print("Enter N value");
	int n = sc.nextInt();
	
	int i = 1;
	   
	   do
	   {
		  System.out.println(i);
		  i++;
	   }   while(i <= n);
	   
         sc.close();
	}
	
}
	
