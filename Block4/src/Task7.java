public class Task7
{
	public static void main(String[] args) 
	{
		System.out.println(toStarShorthand(""));
	}
	private static String toStarShorthand(String Txt)
	{
		try
		{
			String Output = Character.toString(Txt.charAt(0));
			int Counter = 1;
			
	        for (int i = 1; i < Txt.length(); i++) 
	        {
	            if (Txt.charAt(i) == Txt.charAt(i - 1) && i != Txt.length() - 1) 
	            	Counter++;
	            else if (Txt.charAt(i) != Txt.charAt(i - 1) && Counter != 1) 
	            {
	            	Output = Output + "*" + Counter + Txt.charAt(i);
	            	Counter = 1;
	            } 
	            else if (Txt.charAt(i) == Txt.charAt(i - 1) && i == Txt.length() - 1) 
	            	Output = Output + "*" + ++Counter;
	            else  
	            	Output += Txt.charAt(i);
	        }
	        return Output;
		}
		catch(StringIndexOutOfBoundsException e)
		{
			return "";
		}
	}
}