package sumarray;
public class SumArray 
{
    public static void main(String[] args) 
    {
        int ar[] = {1,2,3,4,5};
        int sum = 0;

        int half = (ar.length + 1) / 2;

        for (int i = 0; i < half; i++) 
        {
            sum = sum + ar[i];
        }

        System.out.println(sum);
    }
    
}