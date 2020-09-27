public class Task10{
	public static void main(String[] args) 
	{	
		System.out.println(boxSeq(0));
		System.out.println(boxSeq(1));
		System.out.println(boxSeq(2));
		System.out.println(boxSeq(1));
		System.out.println(boxSeq(2));
		//...//
	}
	
	static int NumOfFields = 0;

	private static int boxSeq(int step) 
	{
		if(step == 0)
			NumOfFields=NumOfFields +0;
		if(step == 1) 
			NumOfFields=NumOfFields +3;
		if(step == 2) 
			NumOfFields=NumOfFields -1;
		return NumOfFields;
	}
}