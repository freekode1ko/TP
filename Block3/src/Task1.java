public class Task1{
	public static void main(String[] args) 
	{
		System.out.println(solutions(1,0,1));
	}
	private static int solutions(double a, double b, double c)
	{
		double D = Math.pow(b, 2) - 4*a*c;
		if (D>0) return 2;
		else if (D<0) return 0;
		return 1;
	}
}