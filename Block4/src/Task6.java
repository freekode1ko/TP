public class Task6
{
	public static void main(String[] args) 
	{
		System.out.println(buqqer(9));
	}
	private static int buqqer(int n) 
	{
        int counter = 0;
        if (n < 0) 
            return 0;

        while (n > 9)
        {
            int s = 1;
            counter++;
            for (; n > 0; n = n / 10) 
                s = s * (n % 10);
            n = s;
        }
        return counter;
    }
}