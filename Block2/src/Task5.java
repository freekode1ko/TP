public class Task5{
	public static void main(String[] args) 
	{	
		System.out.println(getDecimalPlaces("3.1"));
	}
	private static int getDecimalPlaces(String Num)
	{
		String[] NumAfterDot;
		NumAfterDot = Num.split("\\.");
		try {return NumAfterDot[1].length();}
		catch (ArrayIndexOutOfBoundsException out) {return 0;}
	}
}