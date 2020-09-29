public class Task4{
	public static void main(String[] args) 
	{
		System.out.println(FlipEndChars("Cat, dog, and mouse."));
	}
	private static String FlipEndChars(String Text)
	{
		if (Text.length()<3) return "Incompatible";
		String FirstChar = String.valueOf(Text.charAt(0));
		String LastChar = Text.substring(Text.length()-1);
		if (FirstChar.equals(LastChar) == true) return "Two's a pair";
		
		String FlipedTxt=Text.replace(FirstChar, LastChar);
		
		return FlipedTxt.substring(0, FlipedTxt.length()-1)+FirstChar;
	}
}