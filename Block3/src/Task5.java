import java.util.regex.*;

public class Task5{
	public static void main(String[] args) 
	{
		System.out.println(isValidHexCode("#CD5C5C"));
	}
	private static boolean isValidHexCode(String Code)
	{
		if (!String.valueOf(Code.charAt(0)).equals("#")) return false;
		if (Code.length()!=7) return false;
		Pattern pat = Pattern.compile("#[a-fA-F0-9]{6}");
		Matcher mat = pat.matcher(Code);
		return mat.matches();
	}
}
