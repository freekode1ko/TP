public class Task1
{
	public static void main(String[] args) 
	{
		// Ecnrypt
		for(int i = 0; i < encrypt("Hello").length;i++)
			System.out.println(encrypt("Hello")[i]);
		
		// Decrypt
		int[] CryptedWord = {72, 33, -73, 84, -12, -3, 13, -13, -68}; //"Hi there!"
		System.out.println(decrypt(CryptedWord));
	}
	private static int[] encrypt(String Text)
	{
		int[] Output = new int[Text.length()];
		Output[0] = (int)Text.charAt(0);
		for(int i = 1; i < Text.length(); i++)
		{
			int Prev = (int)Text.charAt(i-1);
			Output[i] = Math.abs(Prev - (int)Text.charAt(i));
		}
		return Output;
	}
	
	private static String decrypt(int[] Crypt)
	{
		String Output = "";
		//Output = Output + Character.toString((char) Crypt[0]);
		int NumOfChar = 0;
        for (int Char: Crypt) 
        {
        	NumOfChar = NumOfChar + Char;
            Output = Output + Character.toString((char) NumOfChar);
        }
		return Output;
	}
}
