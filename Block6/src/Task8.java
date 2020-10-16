import java.util.LinkedHashMap;
import java.util.Map;

public class Task8
{
	public static void main(String[] args) 
	{	
		System.out.println(convertToRoman(16));
	}
	private static String convertToRoman(int Num)
	{
		LinkedHashMap<String, Integer> RomanNums = new LinkedHashMap<String, Integer>();
		RomanNums.put("M", 1000);
		RomanNums.put("CM", 900);
		RomanNums.put("D", 500);
		RomanNums.put("CD", 400);
		RomanNums.put("C", 100);
		RomanNums.put("XC", 90);
		RomanNums.put("L", 50);
	    RomanNums.put("XL", 40);
	    RomanNums.put("X", 10);
	    RomanNums.put("IX", 9);
	    RomanNums.put("V", 5);
	    RomanNums.put("IV", 4);
	    RomanNums.put("I", 1);
	    
	    String Output = "";
	    for(Map.Entry<String, Integer> entry : RomanNums.entrySet())
	    {
	      int matches = Num/entry.getValue();
	      Output = Output + oneMore(entry.getKey(), matches);
	      Num = Num % entry.getValue();
	    }
	    return Output;
	}

	public static String oneMore(String s, int n) 
	{
	    if(s == null) 
	        return null;
	    final StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < n; i++) 
	        sb.append(s);
	    return sb.toString();
	}
}
