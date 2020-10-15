public class Task2
{
	public static void main(String[] args) 
	{
		System.out.println(translateWord("button"));
		System.out.println(translateSentence("Do you think it is going to rain today?"));
	}
	 public static String translateWord(String Word) {
	        if (Word.length() == 0) 
	            return "";
	        
	        String Vowels = "aeouiAEOUI";
	        String Marks = ";!?,.-_";
	        
	        if (Vowels.indexOf(Word.charAt(0)) != -1) 
	            return Word + "yay";

	        for (int i = 0; i < Word.length(); i++) 
	        {
	            if (Vowels.indexOf(Word.charAt(i)) != -1 && Marks.indexOf(Word.charAt(Word.length() - 1)) != -1) 
	                return Word.substring(i, Word.length() - 1) + Word.substring(0, i)+ "ay" + Word.substring(Word.length() - 1);
	            else if (Vowels.indexOf(Word.charAt(i)) != -1) 
	                return Word.substring(i) + Word.substring(0, i) + "ay";
	        }

	        return Word;
	    }

	    public static String translateSentence(String Text) 
	    {
	        String[] SplitedText = Text.split(" ");
	        StringBuilder res = new StringBuilder();

	        for (String Word: SplitedText) 
	            res.append(translateWord(Word)+" ");

	        return res.toString();
	    }
}