public class Task6{
	public static void main(String[] args) 
	{	
		System.out.println(Fibonacci(12));
	}
	private static int Fibonacci(int NumbFib)
	{
		int a = 1;
		  int b = 2;
		  for (int i = 3; i <= NumbFib; i++) {
		    int c = a + b;
		    a = b;
		    b = c;
		  }
		  return b;
	}
}
