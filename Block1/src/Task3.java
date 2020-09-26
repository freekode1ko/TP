public class Task3{
	public static void main(String[] args) 
	{
		int Chicks = 5;
		int Cows = 2;
		int Pigs = 8;
		System.out.println(LegsCounter(Chicks,Cows,Pigs));
	}
	private static int LegsCounter(int Chicks, int Cows, int Pigs)
	{
		int ChickLegs = 2;
		int CowLegs = 4;
		int PigLegs = 4;
		return (ChickLegs * Chicks) + (CowLegs * Cows) + (Pigs * PigLegs);
	}
}