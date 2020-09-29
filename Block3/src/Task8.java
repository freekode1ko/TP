public class Task8{
	public static void main(String[] args) 
	{
		System.out.println(longestZero("11111"));
	}
	private static String longestZero(String Nums)
	{
        int max = Integer.MIN_VALUE;
        String Longest = "";
        String[] Splited = Nums.split("1");
        for (String symb: Splited) 
            if (symb.length() > max) 
            {
                max = symb.length();
                Longest = symb;
            }
        return Longest;
	}
}