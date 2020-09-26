public class Task5{
	public static void main(String[] args) 
	{
		int N = 15;
		int a = 11;
		int b = 11;
		System.out.println(Operation(N,a,b));
	}
	private static String Operation(int N, int a, int b)
	{	
		if (a + b == N) return "Added";
		else if (a - b == N) return "Subtracted";
		return "None";
	}
}