public class Task3
{
	public static void main(String[] args) 
	{
		System.out.println(canComplete("bbutl", "beautiful"));
	}
	
	private static boolean canComplete(String CrakedWord, String FullWord)
	{	
		for(int Exst = 0; Exst < CrakedWord.length(); Exst++)
			if(FullWord.indexOf(CrakedWord.charAt(Exst)) == -1) return false;
		try 
		{
			int lastnum = -1;
			for(int i = 0; i < CrakedWord.length(); i++)
				for(int j = 0; j < FullWord.length(); j++)
				{
					Character CW = CrakedWord.charAt(i);
					Character FW = FullWord.charAt(j);
					if (CW.equals(FW))
						if(lastnum < j)
						{lastnum = j; break;}
						else if(lastnum >= j){return false;}
				}
			return true;
		}
		catch(Exception Ex)
		{return false;}
	}
}