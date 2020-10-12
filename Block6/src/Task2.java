public class Task2
{
	public static void main(String[] args) 
	{
		System.out.println(translateWord("Apple"));
	}
	private static String translateWord(String Word)
	{
		if (Word.equals("")) return "";
		
		char[] charArray = Word.toCharArray();
		String cons = "BCDFGHJKLMNPQRSTVWXZ";
		String vowl = "AEIOUY";
		String a = "";
		String b = "";
		boolean vowel = false;
		for(char c : charArray)
		{
			if(cons.toLowerCase().contains(String.valueOf(c).toLowerCase()) == true)
			{
				if(vowel == false) a = a + c;
				else b = b + c;
			}
			else
			{
				vowel = true;
				b = b + c ;
			}
		}
		b = b + a;
		if(vowl.toLowerCase().contains(String.valueOf(b.toCharArray()[0]).toLowerCase()) == true )
			b = b + "yay";
		else b = b + "ay";
		return b;
	}
}