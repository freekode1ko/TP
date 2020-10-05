public class Task1{
	public static void main(String[] args) 
	{
		System.out.println(Esse(10, 7, "hello my name is Bessie and this is my essay"));
	}
	private static String Esse(int n, int k, String Text)
	{
        String[] SplitedTxt = Text.split(" ");
        String Output = SplitedTxt[0];
        int LenLength = Output.length();

        for (int i = 1; i < n; i++) 
        {
            if (SplitedTxt[i].length() + LenLength <= k) 
            {
            	Output = Output + " " + SplitedTxt[i];
            	LenLength = LenLength + SplitedTxt[i].length();
            } 
            else 
            {
            	Output = Output + "\n" + SplitedTxt[i];
            	LenLength = SplitedTxt[i].length();
            }
        }

        return Output;
    }
}