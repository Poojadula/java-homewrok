class LogicalOperator
{
  public static void main(String[] args)
  {
	int a = 10;
	int b = 5; 
	boolean result1 = (a > b) && (b > 0);
	boolean result2 = (a < b) || (b >0);
	boolean result3 = (a == b);
	
	System.out.println("LogicalOperator");
	System.out.println("Result of && : " + result1);
	System.out.println("Result of || : " + result2);
	System.out.println("Result of == : " + result3);
	
  }
	
	
}