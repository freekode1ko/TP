public class Task6
{
	public static void main(String[] args) 
	{
		long cardNum = 1234567890123452l;
		System.out.println(validateCard(cardNum));
	}
	private static boolean validateCard(long CN)
	{
		String CardNum = String.valueOf(CN);
		if (CardNum.length() < 14 || CardNum.length() > 19) return false;
		int CheckDigit = Integer.parseInt(String.valueOf(CardNum.charAt(CardNum.length()-1)));
		String RawCardNum = CardNum.substring(0, CardNum.length()-1);
		StringBuffer strBuffer = new StringBuffer(RawCardNum);
		String ReverseRawCardNum = strBuffer.reverse().toString();
		long DoubleAndSum = DaSnums(ReverseRawCardNum);
		boolean output = (10 - (Math.abs(DoubleAndSum) % 10)) == CheckDigit;
		
		return output;
	}
	private static int DaSnums(String CN)
	{
		int summ = 0;
		for(int i = 0; i < CN.length(); i++)
		{
			int dgt = Character.getNumericValue(CN.charAt(i));
			if(i%2==0)
			{
				dgt = dgt * 2;
				if(dgt>9)
					summ = summ+((dgt/10)+(dgt%10));
				else
					summ = summ + dgt;
			}
			else
				summ = summ + dgt;
		}
		return summ;
	}
}