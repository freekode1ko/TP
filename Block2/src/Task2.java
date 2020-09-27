import java.util.Arrays;

public class Task2{
	public static void main(String[] args) 
	{	int[] Nums = {44, 32, 86, 19};
		System.out.println(differenceMaxMin(Nums));
	}
	private static int differenceMaxMin(int[] Nums)
	{
		int Max = Arrays.stream(Nums).max().getAsInt();
		int Min = Arrays.stream(Nums).min().getAsInt();
		return Max-Min;
	}
}
