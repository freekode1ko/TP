import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3
{
	public static void main(String[] args) 
	{
		System.out.println(validColor("rgba(0,0,0,0.123456789)"));
	}
	
	private static Boolean validColor(String Color) 
	{
		String[] Type = Color.split("\\(");
		

		if((Type[0].toLowerCase()).equals("rgb"))
		{
			String Regex = "rgb\\D[0-255]{1,3},[0-255]{1,3},[0-255]{1,3}\\D";
			Pattern pattern = Pattern.compile(Regex);
			Matcher match = pattern.matcher(Color);
			return match.lookingAt();
		}
		
		if((Type[0].toLowerCase()).equals("rgba"))
		{
			String Regex = "rgba\\D[0-255]{1,3},[0-255]{1,3},[0-255]{1,3},[0-1]{1}\\D";
			Pattern pattern = Pattern.compile(Regex);
			StringBuilder ComplidedRGBA = new StringBuilder();
			try 
			{
				String[] SplitedColor = Color.split(",");
				Double Alptha = Double.parseDouble(SplitedColor[SplitedColor.length-1].substring(0,SplitedColor[SplitedColor.length-1].length()-1));
				for(int i = 0; i < SplitedColor.length-1; i++)
					ComplidedRGBA.append(SplitedColor[i]+",");
				ComplidedRGBA.append(String.valueOf(Math.round(Alptha)));
				ComplidedRGBA.append(")");
			}catch (Exception Ex) {return false;}
			Matcher match = pattern.matcher(ComplidedRGBA);
			return match.lookingAt();
		}
		return false;
	}
}
