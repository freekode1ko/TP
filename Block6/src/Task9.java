public class Task9
{
	public static void main(String[] args) 
	{	
		System.out.println(formula("16 * 10 = 160 = 14 + 120"));
	}
	private static boolean formula(String formul)
	{
		String[] SplitedFormula = formul.split(" = ");
		int ANS = Integer.parseInt(SplitedFormula[1]);
		boolean output = false;
		for(int i = 0; i<SplitedFormula.length; i=i+2)
		{
			String[] SplitedPart = SplitedFormula[i].split(" ");
			int PartAns = Integer.parseInt(SplitedPart[0]);
			for(int j = 1; j < SplitedPart.length;)
			{
				int nxt;
				switch(SplitedPart[j]) 
				{
					case("+"): 
						nxt = Integer.parseInt(SplitedPart[j+1]);
						PartAns = PartAns + nxt;
						j = j + 2;
						break;
					case("*"):
						nxt = Integer.parseInt(SplitedPart[j+1]);
						PartAns = PartAns * nxt;
						j = j + 2;
						break;
					case("/"):
						nxt = Integer.parseInt(SplitedPart[j+1]);
						PartAns = PartAns / nxt;
						j = j + 2;
						break;
				}
			}
			if(ANS == PartAns) output = true;
			else return false;
		}
		return output;
	}
}