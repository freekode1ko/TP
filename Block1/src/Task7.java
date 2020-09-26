public class Task7{
	public static void main(String[] args) 
	{
		System.out.println(addUpTo(7));
	}
	private static int addUpTo(int a)
	{	
		int out = 0;
		int i = 0;
		while (i <= a)
		{
			out = out + i;
			i++;
		}
		return out;
	}
}