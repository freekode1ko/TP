public class Task9
{
	public static void main(String[] args) 
	{
		System.out.println(trouble(451999277, 411772899));
	}
	private static boolean trouble(long num1, long num2)
	{
		String SecondNum = String.valueOf(num1);
		
        long TN = 0;
        int row = 1;
        long num = num1 % 10;
        
        num1 /= 10;
		
		while (num1 > 0)
		{
            if (num == num1 % 10) 
                row++;
            else if (row == 3) 
            {
            	TN = num;
                row = 1;
            } 
            else 
                row = 1;

            num = num1 % 10;
            num1 /= 10;
        }
		
		String regex = String.valueOf(TN)+String.valueOf(TN);
		if(SecondNum.indexOf(regex) != -1) return true;
		return false;
	}
}