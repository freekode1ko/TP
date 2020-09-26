public class Task9{
	public static void main(String[] args) 
	{
		int[] arr = {1,5,9};
		System.out.println(SumofCubes(arr));
	}
	private static int SumofCubes(int[] R)
	{
		int sum = 0, i = 0;
		while (i < R.length) 
		{
			sum = (int) (Math.pow(R[i], 3) + sum);
			i++;
		}
		return sum;
	}
}