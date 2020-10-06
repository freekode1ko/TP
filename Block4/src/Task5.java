public class Task5
{
	public static void main(String[] args) 
	{
		System.out.println(BMI("154 pounds", "2 meters"));
	}

	private static String BMI(String Mass, String Height) 
	{
		String[] MassParse = Mass.split(" ");
		String[] HeightParse = Height.split(" ");
		double mass;
		double height;
		
		if(MassParse[1].equals("pounds"))
			mass = Double.parseDouble(MassParse[0])*0.453592;
		else mass = Double.parseDouble(MassParse[0]);
		
		if(HeightParse[1].equals("inches"))
			height = Double.parseDouble(HeightParse[0])/39.37;
		else height = Double.parseDouble(HeightParse[0]);
		
		double bmi = (double)Math.round(mass/(Math.pow(height, 2))*100)/100;
		
		if (bmi < 18.5)
			return bmi+ " Underweight";
		else if (18.5 <= bmi && bmi <= 24.9)
			return bmi+ " Normal weight";
		else if (bmi >= 25)
			return bmi+ " Overweight";
		
		return "Wrong data at input";
	}
}