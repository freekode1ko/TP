public class Task9{
	public static void main(String[] args) 
	{
		System.out.println(nextPrime(11));
	}
	private static int nextPrime(int Num)
	{
		int iter;
		while(true)
		{
		    int l = (int) Math.sqrt(Num);
		    iter = 0;
		    for(int i = 2; i <= l; i ++)
		    	if(Num % i == 0)  iter++;
		    if(iter == 0) return Num;
		    else
		    {
		    	Num++;
		    	continue;
		    }
		}
	}
}
