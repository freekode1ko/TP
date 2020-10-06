import java.util.HashSet;

public class Task10
{
	public static void main(String[] args) 
	{
		System.out.println(countUniqueBooks("ZZABCDEF",'Z'));
	}
	private static int countUniqueBooks(String Row, char bookEnd)
	{
		boolean Set = false;
		String str = "";
		HashSet<String> Hset = new HashSet<String>();
		for(int i = 0; i<Row.length(); i++) 
		{
			str = Row.substring(i, i+1);
			
			if(str.codePointAt(0) == bookEnd && Set ) 
				Set = false;
			else if(str.codePointAt(0) == bookEnd && !Set)
				Set = true;
			else if(Set)
				Hset.add(Row.substring(i, i+1));
	
		}
		return Hset.size();
	}
}
	
