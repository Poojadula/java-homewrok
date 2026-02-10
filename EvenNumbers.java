import java.util.Scanner;
class EvenNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number");
		int n = sc.nextInt();
		System.out.println("Even numbers up to " + n + " are");
		
		for (int i =2; i <= n; i +=2)
		{
			System.out.println(i + " ");
		}
		    sc.close();
	}
	         
	
}