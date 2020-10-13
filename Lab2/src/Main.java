import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) 
	{
		String Path = "E:\\Program Files (x86)\\Ecl-Workspace\\Lab2\\src\\Input";
		ArrayList<String> Data = DataProcessing(DataLoad(Path));
		ArrayList<String> TotalNationalPop = new ArrayList<String>();
		int TotalNumsImmig = 0;
		double ProcentImigInCoutry = 0.0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		String CountryMax = "";
		String CountryMin = "";
		
		
		System.out.println("Country"+"\t \t"+"Immigrants"+"\t \t"+"% World total"+"\t \t"+"% Population");
		for(int i = 0; i < Data.size(); i++)
			{
				System.out.println(Data.get(i)+"\t \t"+Data.get(i+1)+"\t \t"+Data.get(i+2)+"\t \t"+Data.get(i+3)); 
				TotalNumsImmig = TotalNumsImmig + (Integer.parseInt(Data.get(i+1)));
				ProcentImigInCoutry = ProcentImigInCoutry + (Double.parseDouble(Data.get(i+2)));
				
				double prevMax = max;
				max = Math.max(max, Double.parseDouble(Data.get(i+2)));
				if(prevMax != max)
					CountryMax = Data.get(i);
				
				double prevMin = min;
				min = Math.min(min, Double.parseDouble(Data.get(i+2)));
				if(prevMin != min)
					CountryMin = Data.get(i);
				
				long TtlNatlPop = (long) ((Long.parseLong(Data.get(i+1)) * 100) / (Double.parseDouble(Data.get(i+2))));
				
				TotalNationalPop.add(String.valueOf(TtlNatlPop));
				
				i = i + 3;
			}
		
		System.out.println("\nTotal immigrants: " + TotalNumsImmig);
		System.out.println("Total procent of immingrants: " + ProcentImigInCoutry);
		System.out.println("max: " + CountryMax +" ("+max+") ");
		System.out.println("max: " + CountryMin +" ("+min+") ");
		
		System.out.println("\nTotal national population: ");
		int j = 0;
		for(int i = 0; i < Data.size(); i++)
		{
			System.out.println(Data.get(i)+"\t"+TotalNationalPop.get(j));
			i = i + 3; j++;
		}
	}
	
	private static ArrayList<String> DataProcessing(String[] SplitedData)
	{
		ArrayList<String> Output = new ArrayList<String>();
		
		for(int i = 0; i < SplitedData.length; i++)
		{
			if(!isNumeric(SplitedData[i]) && !isNumeric(SplitedData[i+1]) && !isNumeric(SplitedData[i+2]))
				{Output.add(SplitedData[i] +" "+ SplitedData[i+1] +" "+ SplitedData[i+2]); i = i + 2;}
			
			else if(!isNumeric(SplitedData[i]) && !isNumeric(SplitedData[i+1]))
				{Output.add(SplitedData[i]+" "+SplitedData[i+1]); i++;}
			
			else Output.add(SplitedData[i]);
		}
		return Output;
	}
	
	private static String[] DataLoad(String Path)
	{
		StringBuilder SplidetData = new StringBuilder();
		String Output = "";
		try 
		{
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(Path));
			String line = reader.readLine();
			while(line!=null)
			{
				SplidetData.append(line);
				line = reader.readLine();
			}
			reader.close();
		}catch(IOException Ex) {Ex.printStackTrace();}
		Output = String.valueOf(SplidetData);
		return Output.split(" ");
	}
	
	public static boolean isNumeric(String strNum) 
	{
	    if (strNum == null) 
	        return false;
	    try {double d = Double.parseDouble(strNum);} 
	    catch (NumberFormatException nfe) {return false;}
	    return true;
	}
}

/*
Country	Number of Immigrants	Percentage of Total Immigrants in the World	Immigrants as Percentage of National Population
United States	45,785,090	19.8	14.3
Russia	11,048,064	4.8	7.7
Germany	9,845,244	4.3	11.9
Saudi Arabia	9,060,433	3.9	31.4
United Arab Emirates	7,826,981	3.4	83.7
United Kingdom	7,824,131	3.4	12.4
France	7,439,086	3.2	11.6
Canada	7,284,069	3.1	20.7
Australia	6,468,640	2.8	27.7
Spain	6,466,605	2.8	13.8

		String US[] = {"United States","45785090","19.8","14.3"};
		String RUS[] = {"Russia","11048064","4.8","7.7"};
		String GER[] = {"Germany","9845244","4.3","11.9"};
		String ARA[] = {"Saudi Arabia","9060433","3.9","31.4"};
		String UAE[] = {"United Arab Emirates","7826981","3.4","86.7"};
		String UK[] = {"United Kingdom","7824131","3.4","12.4"};
		String FR[] = {"France","7439086","3.2","11.6"};
		String CAN[] = {"Canada","7284069","3.1","20.7"};
		String AUS[] = {"Australia","6468640","2.8","27.7"};
		String SP[] = {"Spain","6466605","2.8","13.8"};
*/