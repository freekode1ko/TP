public class Task10
{
	public static void main(String[] args) 
	{	
		System.out.println(palindromedescendant(23336014));
	}
	
	private static boolean palindromedescendant(int numer)
	{
		String NUMS = String.valueOf(numer);
		if (isPalindrome(NUMS)) return true;
	
		while (NUMS.length() > 1) 
		{
            StringBuilder Ans = new StringBuilder();
            for (int i = 0; i < NUMS.length() - 1; i = i + 2) 
            {
                if (i == NUMS.length() - 1) 
                	Ans.append(NUMS);
                int sum = Integer.parseInt((String.valueOf(NUMS.charAt(i)))) + Integer.parseInt((String.valueOf(NUMS.charAt(i+1))));
                Ans.append(sum);
            }

            if (NUMS.length() % 2 != 0)
            	Ans.append(NUMS.charAt(NUMS.length() - 1));

            if (isPalindrome(Ans.toString())) return true;
            NUMS = Ans.toString();
        }
        return false;
	}
	
	public static boolean isPalindrome(String NUMS) 
	{
        int j = NUMS.length() - 1;
        for(int i = 0; i < j; i++) 
        {
            if (NUMS.charAt(i) != NUMS.charAt(j)) return false;
            j--;
        }
        return true;
    }
}