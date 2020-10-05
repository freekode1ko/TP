public class Task5
{
	public static void main(String[] args) 
	{
		System.out.println(BMI("205 pounds", "73 inches"));
	}

	private static double BMI(String Mass, String Height) 
	{
		String[] MassParse = Mass.split(" ");
		String[] HeightParse = Height.split(" ");
		double mass;
		double height;
		
		if(MassParse[1]=="pounds")
			mass = Double.parseDouble(MassParse[0])*0.453592;
		else mass = Double.parseDouble(MassParse[0]);
		
		if(HeightParse[1]=="inches")
			height = Double.parseDouble(HeightParse[0])*2.54;
		else height = Double.parseDouble(HeightParse[0]);

		return (double)Math.round(Math.pow((mass/2.205)/(height/39.37),2)*100)/100;
	}
}