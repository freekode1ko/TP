public class Task9
{
	public static void main(String[] args)
	{
		System.out.println(correctTitle("LaNestAr-kiNG OF THE tronE"));
	}
	private static String correctTitle(String inputStr)
	{
		String[] SplitedInput = inputStr.split(" ");
		String output = "";
		for(int i = 0; i < SplitedInput.length; i++)
		{
			SplitedInput[i] = SplitedInput[i].toLowerCase();
			if(!SplitedInput[i].equals("and") && !SplitedInput[i].equals("the") && !SplitedInput[i].equals("of") && !SplitedInput[i].equals("in"))
			{
			String FirstChar = String.valueOf(SplitedInput[i].charAt(0));
			String OtherPart = SplitedInput[i].substring(1,SplitedInput[i].length());
			output = output + FirstChar.toUpperCase() + OtherPart.toLowerCase() + " ";
			}else output = output + SplitedInput[i] + " ";
			
		}
		if (output.indexOf("-") == -1)
			return output;
		else 
		{
			SplitedInput = output.split("-");
			output = String.valueOf(SplitedInput[0]);
			for(int i = 1; i < SplitedInput.length; i++)
			{
				String OtherPart = SplitedInput[i].substring(0,SplitedInput[i].length());
				output = output+"-"+ String.valueOf(OtherPart.charAt(0)).toUpperCase() + OtherPart.substring(1,SplitedInput[i].length()-1);
			}
			return output;
		}
	}
}