public class Task7{
	public static void main(String[] args) 
	{	
		System.out.println(isValid("393939"));
	}
	private static boolean isValid(String Input)
	{
		try 
		{
			Integer.parseInt(Input); 
			if (String.valueOf(Input).length() < 6)
				return true;
		}
		catch(Throwable S) 
		{
			return false;
		}
		return false;
	}
}