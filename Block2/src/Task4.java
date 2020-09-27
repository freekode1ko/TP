public class Task4{
	public static void main(String[] args) 
	{	int[] Nums = {3, 3, -2, 408, 3, 3};
		for (int Num:cumulativeSum(Nums))
			System.out.println(Num);
	}
	private static int[] cumulativeSum(int[] Nums)
	{
		int[] Changed = new int[Nums.length];
		Changed[0] = Nums[0];
		for (int i = 1;i < Nums.length; i++)
		{
			int num = 0;
			for (int j = i; j != -1; j--)
				num = num + Nums[j];
			Changed[i] = num;
		}
		return Changed;
	}
}