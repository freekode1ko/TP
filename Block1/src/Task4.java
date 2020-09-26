public class Task4{
	public static void main(String[] args) 
	{
		double prob = 0.9;
		double prize = 3;
		double pay = 2;
		System.out.println(profitableGamble(prob,prize,pay));
	}
	private static boolean profitableGamble (double prob, double prize, double pay)
	{
		if (prob*prize > pay) return true;
		else return false;
	}
	
}