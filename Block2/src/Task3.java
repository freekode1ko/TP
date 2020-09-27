public class Task3{
	public static void main(String[] args) 
	{	int[] Nums = {9, 2, 2, 5};
		System.out.println(isAvgWhole(Nums));
	}
	private static boolean isAvgWhole(int[] Nums)
	{
		int avg = 0;
		for(int Num:Nums)
			avg= avg+Num;

		if (avg%Nums.length == 0)
			return true;
		return false;
	}
}