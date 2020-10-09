public class Task2
{
	public static void main(String[] args) 
	{
		System.out.println(canMove("Queen", "C4", "D6"));
	}
	private static boolean canMove(String Who, String From, String To)
	{
		int FromNum = Character.getNumericValue(From.charAt(1));
        int ToNum = Character.getNumericValue(To.charAt(1));
        
        char FromLetr = From.charAt(0);
        char ToLetr = To.charAt(0);
        
		switch (Who) 
		{
	        case ("Pawn"):
	        	return FromLetr == ToLetr && Math.abs(FromNum - ToNum) == 1;
	        case ("Knight") :
	        	return  Math.abs(FromLetr - ToLetr) == 1 && Math.abs(FromNum - ToNum) == 2;
	        case ("Bishop"):
	        	return Math.abs(FromLetr - ToLetr) == Math.abs(FromNum - ToNum);
	        case ("Rook"):
	        	return FromLetr == ToLetr || FromNum == ToNum;
	        case ("Queen"):
	        {
	            int x = Math.abs(FromNum - ToNum);
	            int y = Math.abs(FromLetr - ToLetr);
	            return (x == y || x == 0 || y == 0);
	        }
	        case ("King"): 
	        {
	            int x = Math.abs(FromNum - ToNum);
	            int y = Math.abs(FromLetr - ToLetr);
	            return (Math.abs(x - y) <= 1);
	        }
		}
		return false;
	}
}