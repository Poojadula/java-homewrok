import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n =3;
		int[] arr = new int[n];
		for(int i = 0; i <3; i++)
		{
			arr[i] = sc.nextInt();
		}
			
	       int sum = arr[0] + arr[1];
		   System.out.println(sum);
		
	}
		
}