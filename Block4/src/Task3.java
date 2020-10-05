public class Task3
{
	public static void main(String[] args) 
	{
		System.out.println(toCamelCase("is_modal_open"));
		System.out.println(toSnakeCase("helloEdabit"));
	}
	private static String toCamelCase(String TXT)
	{	
		String[] Spliter = TXT.split("_");
		String Output = Spliter[0];
		for(int i = 1; i < Spliter.length;i++)
			Output = Output + Character.toUpperCase(Spliter[i].charAt(0))+Spliter[i].substring(1);
		return Output;
	}
	
	private static String toSnakeCase(String TXT)
	{	
		String Output = "";
        int start = 0;

        for (int i = 0; i < TXT.length(); i++) 
        {
            if (TXT.charAt(i) == Character.toUpperCase(TXT.charAt(i))) 
            {
            	Output = Output + TXT.substring(start, i) + "_";
                start = i;
            }

            if (i == TXT.length() - 1 && start != 0) 
            {
            	Output = Output + TXT.substring(start);
            }

            if (i == TXT.length() - 1 && start == 0) 
            {
            	Output = Output + TXT;
            }
        }

        return Output.toLowerCase();
	}
}