public class Task4
{
	public static void main(String[] args) 
	{
		int[] Nums = {1, 2, 3, 4, 5, 6};
		System.out.println(sumDigProd(Nums));
	}
	
	private static int sumDigProd(int[] nums)
	{	
		int SUMM = 0;
		for(int num:nums)
			SUMM = SUMM + num;
		
		String summ = String.valueOf(SUMM);
		int Comp = 1;
		
		while(summ.length() != 1)
		{
		for(int i = 0; i < summ.length(); i++)
			Comp = Comp * Character.getNumericValue(summ.charAt(i));
		summ = Integer.toString(Comp);
		Comp = 1;
		}

		return Integer.parseInt(summ);
	}
}