import java.util.ArrayList;

public class Task4
{
	public static void main(String[] args) 
	{
		System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2","b"));
	}
	
	private static String stripUrlParams(String url, String... parameter) 
	{ 
		String[] SplitedURL= url.split("\\?");
		if(SplitedURL.length<2) return url;
		String[] Params = SplitedURL[1].split("&");
		StringBuilder OutPut = new StringBuilder();
		ArrayList<Integer> OtherParam = new ArrayList<Integer>();
		
		OutPut.append(SplitedURL[0]+"?");
		for(int i = 0; i < Params.length-2; i++)
			for(int j = i+1; j < Params.length; j++)
			{
				Character W1 = Params[i].charAt(0);
				Character W2 = Params[j].charAt(0);
				if(W1.equals(W2))
				{
					OutPut.append(Params[i].charAt(0));
					OutPut.append("="+Params[j].charAt(2)+"&");					
				}else {OtherParam.add(j);}
					
			}
		for(int i = 0; i < OtherParam.size(); i++) 
			OutPut.append(Params[OtherParam.get(i)]+"&");
		if(parameter.length == 0)
			return(OutPut.substring(0,OutPut.length()-1));
		else 
		{
			SplitedURL= String.valueOf(OutPut).split("\\?");
			Params = SplitedURL[1].split("&");
			OutPut = new StringBuilder();
			OutPut.append(SplitedURL[0]+"?");
			
			for(int i = 0; i < Params.length; i++)
			{
				Character W1 = Params[i].charAt(0);
				Character W2 = parameter[0].charAt(0);
				if(!W1.equals(W2))
					OutPut.append(Params[i]+"&");
			}
			return(OutPut.substring(0,OutPut.length()-1));
		}

	}
}