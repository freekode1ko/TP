import java.util.*;
import java.util.HashSet;


public class Task6{
	public static void main(String[] args) 
	{
		int[] Arr = {1,3,4,4,4};
		int[] Arr2 = {2,5,7};
		System.out.println(same(Arr,Arr2));
	}
	private static boolean same(int[] Arr1, int[] Arr2)
	{
		Set<int[]> UArr1 = new HashSet<>(Arrays.asList(Arr1));
		Set<int[]> UArr2 = new HashSet<>(Arrays.asList(Arr2));
		return UArr1.size() == UArr2.size();
	}
}