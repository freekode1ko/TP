import java.util.ArrayList;

public class Task6
{
	public static void main(String[] args) 
	{	
		System.out.println(ulam(206));
	}
	private static int ulam(int n)
	{
		ArrayList<Integer> UlamSeq = new ArrayList<Integer>();
		int max = (n-1)*10;
		UlamSeq.add(1);
		UlamSeq.add(2);
		for(int i =3; i < max; i++)
		{
			int count = 0;
			for (int j = 0; j < UlamSeq.size(); j++)
			{
				for(int k = j+1;k<UlamSeq.size();k++)
				{
					if(UlamSeq.get(j)+UlamSeq.get(k)==i)
						count++;
					if(count>1)
						break;
				}
				if(count>1)
					break;
			}
			if(count==1)
				UlamSeq.add(i);
		}
		return UlamSeq.get(n-1);
	}
}
	