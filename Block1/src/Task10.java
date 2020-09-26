public class Task10{
	public static void main(String[] args) 
	{
		System.out.println(abcmath(1, 2, 3));
	}
	private static boolean abcmath(int a, int b, int c)
	{
		int A = a;
		int i = 1;
		while (i <= b)
		{
			A = A + A;
			i++;
		}
		//System.out.println(A);
		if (A%c == 0) return true;
		return false;
	}
}