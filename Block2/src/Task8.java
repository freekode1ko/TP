public class Task8{
	public static void main(String[] args) 
	{	
		System.out.println(isStrangePair("", ""));
	}
	private static boolean isStrangePair(String Word1, String Word2)
	{
		if (Word1 == "" || Word1 == "")
			return true;
		
		String Condition1 = Word1.substring(Word1.length()-1);
		String Condition2 = String.valueOf(Word2.charAt(0));
		if (Condition1.equals(Condition2) == true) 
			return false;
		
		Condition1 = String.valueOf(Word1.charAt(0));
		Condition2 = Word2.substring(Word2.length()-1);
		if (Condition1.equals(Condition2) == true) 
			return false;
				
		return true;
	}
}