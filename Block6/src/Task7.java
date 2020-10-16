import java.util.HashMap;

public class Task7
{
	public static void main(String[] args) 
	{	
		System.out.println(longestNonrepeatingSubstring("abcda"));
	}
	private static String longestNonrepeatingSubstring(String Letters)
	{
		int i; 
	    int n = Letters.length(); 
	    int st = 0; 
	    int currlen = 0; 
	    int maxlen = 0; 
	    int start = 0; 
	    HashMap<Character, Integer> pos = new HashMap<Character, Integer>(); 

	    pos.put(Letters.charAt(0), 0); 
	     
	    for (i = 1; i < n; i++) 
	        if (!pos.containsKey(Letters.charAt(i)))
	            pos.put(Letters.charAt(i), i);
	        else
	        {
	            if (pos.get(Letters.charAt(i)) >= st) 
	            {
	                currlen = i - st; 
	                if (maxlen < currlen) 
	                {
	                maxlen = currlen; 
	                start = st; 
	                }
	                st = pos.get(Letters.charAt(i)) + 1; 
	            }
	            pos.replace(Letters.charAt(i), i);
	        }
	    if (maxlen < i - st)
	    {
	        maxlen = i - st;
	        start = st;
	    }
	    return Letters.substring(start,start + maxlen);
	}
}