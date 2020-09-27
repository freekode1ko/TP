public class Task9{
	public static void main(String[] args) 
	{	
		System.out.println(isPrefix("retrospect", "sub-"));
		System.out.println(isSuffix("vocation", "-logy"));
	}
	private static boolean isPrefix(String Word, String Pref)
	{
		String[] Pr = Pref.split("-");
		if (Word.substring(0, Pr[0].length()).equals(Pr[0]))
			return true;
		return false;
	}
	private static boolean isSuffix(String Word, String Suff)
	{
		String[] Sf = Suff.split("-");
		if(Word.substring(Word.length()-Sf[1].length(), Word.length()).equals(Sf[1]))
			return true;
		return false;
	}
}
