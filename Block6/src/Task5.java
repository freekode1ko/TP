import java.util.ArrayList;

public class Task5
{
	public static void main(String[] args) 
	{
		ArrayList<String> Hashtags = new ArrayList<String>();
		String Text = "Hey Parents, Surprise, Fruit Juice Is Not Fruit";
		Hashtags = getHashTags(Text);
		
		
		for(String Hashtag:Hashtags)
			System.out.println(Hashtag);
	}
	
	private static ArrayList<String> getHashTags(String Text) 
	{
		ArrayList<String> Hashtags = new ArrayList<String>();
		String ClearedText = Text.replaceAll(",","").toLowerCase();
		String[] SplitedText = ClearedText.split(" ");
		
		if(SplitedText.length < 4)
		{
			for(String Hashteg:SplitedText)
				Hashtags.add("#"+Hashteg);
			return Hashtags;
		}
		
		String LongestWords = findLongest(SplitedText);
		for(String Hashteg:LongestWords.split(" "))
			Hashtags.add("#"+Hashteg);
		return Hashtags;
	}
	
	static String findLongest(String[] SplitedText) 
	{
	    StringBuilder Output = new StringBuilder();
	    int[] biggest = new int[3];
	    for (int i = 1; i < SplitedText.length; i++) 
	        for (int j = 0; j < biggest.length; j++) 
	            if (SplitedText[biggest[j]].length() < SplitedText[i].length()) 
	            {
	                for (int k = biggest.length - 1; k >= j; k--) 
	                    biggest[k] = k == j ? i:biggest[k - 1];
	                break;
	            }

	    for (int aBiggest : biggest) 
	    	Output.append(SplitedText[aBiggest]).append(" ");
	    
	    return Output.toString();
	}
}