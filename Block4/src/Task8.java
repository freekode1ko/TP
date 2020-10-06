import java.util.Arrays;

public class Task8
{
	public static void main(String[] args) 
	{
		System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
	}
	private static boolean doesRhyme(String Txt1,String Txt2)
	{
		String[] Txt1Splited = Txt1.split(" ");
		String[] Txt2Splited = Txt2.split(" ");
		
		String LastWord1 = Txt1Splited[Txt1Splited.length-1].toLowerCase();
		String LastWord2 = Txt2Splited[Txt2Splited.length-1].toLowerCase();
		
		LastWord1 = LastWord1.replaceAll("[.,!?bcdfghjklmnpqrstvwxyz]", "");
		LastWord2 = LastWord2.replaceAll("[.,!?bcdfghjklmnpqrstvwxyz]", "");
		
		Arrays.sort(LastWord1.toCharArray());
		Arrays.sort(LastWord2.toCharArray());

		if(LastWord1.equals(LastWord2))
			return true;
		return false;
	}
}