public class Task10{
	public static void main(String[] args) 
	{
		System.out.println(RightTrianle(70, 130, 110));
	}
	private static boolean RightTrianle(int x, int y, int z)
	{
		if(Math.pow(x, 2)+Math.pow(y, 2) == Math.pow(z, 2) || Math.pow(x, 2)+Math.pow(z, 2) == Math.pow(y, 2) || Math.pow(z, 2)+Math.pow(y, 2) == Math.pow(x, 2)) return true;
		return false;
	}
}