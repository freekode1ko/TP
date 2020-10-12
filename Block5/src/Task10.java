public class Task10
{
	public static void main(String[] args)
	{
		System.out.println(hexLattice(37));
	}
	private static String hexLattice(int NumOfDots)
	{
		if (NumOfDots == 1) return "*";
		else if (NumOfDots < 1) return "Invalid";
		
		int hex = 0;
		int i = 1;
		for(; hex< NumOfDots; i++)
			hex = (3*i*(i-1)+1);
		if (hex > NumOfDots) return "Invalid";
		
		String UpperOutput = ""; 
		// i up of hex with center line (if input: 7 => i == 2, 19 => i == 3)
		// j buttom of hex (if input: 7 => j == 1, 19 => j == 2)
		i--;
		int j = i - 1;
		int Upperline = -1;
		for(int up = 0; up < i; up++)
		{	
			for(; Upperline < i-1;Upperline++)
				UpperOutput = UpperOutput+"*";
			Upperline = Upperline-Upperline -up-2;
			UpperOutput = UpperOutput+"/n";
			
		}

		StringBuffer strBuffer = new StringBuffer(UpperOutput);
		String OutputButtom = strBuffer.reverse().toString();
		String[] SplitedButtom = OutputButtom.split("n/");
		OutputButtom = "";
		for(int str = 2; str < SplitedButtom.length; str++)
			OutputButtom = OutputButtom + SplitedButtom[str]+"/n" ;
		
		String Output = UpperOutput + OutputButtom.substring(0,OutputButtom.length()-2);
		return Output;
	}
}
