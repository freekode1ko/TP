public class Task4
{
	public static void main(String[] args) 
	{
		System.out.println(overTime(13.25, 15, 30, 1.5));
	}
	private static String overTime(double StartWD, double EndWD, double HourRate, double Multiplier)
	{
		double dayPay = (EndWD-StartWD)*HourRate;
		double overwork = EndWD-StartWD;
		if (overwork > 0)
			return "$"+dayPay;
		else
			return "$"+dayPay*Multiplier;
	}
}