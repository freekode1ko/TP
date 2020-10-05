import java.util.ArrayList;
import java.util.Arrays;

public class Task2
{
	public static void main(String[] args) 
	{
		System.out.println(Split("((())())(()(()()))"));
	}
	private static String Split(String Text) 
	{
		String subStr = "";
		ArrayList<String> stak = new ArrayList<String>();
        int Counter = 0;

        for (int i = 0; i < Text.length(); i++) 
        {
            if (Text.charAt(i) == '(') 
            {
                subStr += Text.charAt(i);
                Counter++;
            } 
            else 
            {
            	if (Text.charAt(i) == ')') 
            	{
	                subStr += Text.charAt(i);
	                Counter--;
            	}
            }

            if (Counter == 0) 
            {
            	stak.add(subStr);
                subStr = "";
            }

        }

        return Arrays.toString(stak.toArray());
	}

}
