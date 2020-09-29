public class Task7{
	public static void main(String[] args) 
	{
		System.out.println(isKaprekar(297));
	}
	private static boolean isKaprekar(int n)
	{
		int intPowN = (int) Math.pow(n, 2);
		String StrPowN = Integer.toString((int) Math.pow(n, 2));
		String Left;
		String Right;
		if (StrPowN.length() < 2)
		{
			Left = "0";
			Right = StrPowN;
		}
		else {
			if(intPowN % 2 != 0)
			{
				int half = (int) (0.5 * StrPowN.length());
				Left = StrPowN.substring(0, half);
				Right = StrPowN.substring(half, StrPowN.length());
			}
			else 
			{
				int half = (int) (0.5 * StrPowN.length());
				Left = StrPowN.substring(0, half);
				Right = StrPowN.substring(half+1, StrPowN.length());	
			}}
		int Sum = Integer.parseInt(Left) + Integer.parseInt(Right);
		return Sum==n;
	}
	
}
