public class Task1{
	public static void main(String[] args) 
	{
		System.out.println(Repeter("stop",1));
	}
	private static StringBuilder Repeter(String Word, int numOfRep)
	{
		StringBuilder RepetedWord = new StringBuilder();
		for(int i = 0; i<Word.length();i++)
			for(int j = 0; j < numOfRep; j++)
				RepetedWord.append(Word.charAt(i));
		return RepetedWord;
	}
}