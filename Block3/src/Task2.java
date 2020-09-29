public class Task2{
	public static void main(String[] args) 
	{
		System.out.println(findZip("all zip files are zipped"));
	}
	private static int findZip(String Text)
	{
		int ZIPIndex1 = Text.indexOf("zip");
		int ZIPIndex2 = Text.indexOf("zip",ZIPIndex1+1);
		return ZIPIndex2;
	}
}
