public class Task3{
	public static void main(String[] args) 
	{
		System.out.println(checkPerfect(97));
	}
	private static boolean checkPerfect(int Num)
	{
		int Sum = 0;
		for(int i = 1; i<Num;i++)
			if (Num%i == 0)
				Sum = Sum + i;
		if (Sum == Num) return true;
		return false;
	}
}