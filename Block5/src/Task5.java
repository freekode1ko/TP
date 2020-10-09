import java.util.ArrayList;
import java.util.HashSet;

public class Task5
{
	public static void main(String[] args) 
	{
		String[] Input = {"hoops", "chuff", "bot", "bottom"};
		String[] GetAns = sameVowelGroup(Input);
		for(int i = 0; i < GetAns.length;i++)
			System.out.println(GetAns[i]);
	}
	private static String[] sameVowelGroup(String[] Words)
	{
		String wordVowels = getUniqueVovels(Words[0]);
		String vowels = "aeiou";
		ArrayList<String> result = new ArrayList<>();
		if (wordVowels.length() > 0)
		{
			for (String word:Words)
			{
				boolean valid = true;
				for(int i = 0;i<word.length();i++)
				{
					char c = word.charAt(i);
					if(vowels.contains(Character.toString(c)))
					{
						if(!wordVowels.toString().contains(Character.toString(c)))
						{
							valid = false;
							break;
						}
					}
				}
				if (valid) result.add(word);
			}
		}
		if (result.isEmpty()) result.add(Words[0]);
		return result.toArray(new String[result.size()]);
	}
	
	private static String getUniqueVovels(String str)
	{
		StringBuilder sb = new StringBuilder();
		HashSet<Character> set = new HashSet<>();
		String vowels = "aeiou";
		
		for(int i = 0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if(vowels.contains(Character.toString(c)))
			{
				if(set.add(c))
					sb.append(c);
			}
			if (sb.length() == 5)
				break;
		}
		return sb.toString();
	}
}

	         
		/*
		ArrayList<String> Output = new ArrayList<String>();
		Output.add(Words[0]);
		String vowels = Words[0].replaceAll("[^aeiouAEIOU]", "");
		for(int Wrds = 1; Wrds < Words.length; Wrds++)
				for(int VOW = 0; VOW < vowels.length();VOW++)
				{
					int addCond = 0;
					for(int WrdLtr = 0; WrdLtr < Words[Wrds].length(); WrdLtr++)
					{					
						Character Vowel = vowels.charAt(VOW);
						Character WordLeter = Words[Wrds].charAt(WrdLtr);
						
						if(Vowel.equals(WordLeter))
							addCond++;
						if (addCond == vowels.length())
							{Output.add(Words[Wrds]);addCond = 0;}
					}
				}
		return Output;
	}
	
}
		*/