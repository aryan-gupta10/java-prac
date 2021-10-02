package collectionsPckg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListUsingCollectionsUtilityClass
{
	public static void main(String[] args)
	{
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(234);
		numberList.add(154);
		numberList.add(276);
		numberList.add(876);
		numberList.add(345);
		
		System.out.println("Existing list: " +numberList.toString());
		
		sortAndPrintNumbersInNaturalOrder(numberList);
		
		sortAndPrintInDescendingOrder(numberList);
	}
	
	private static void sortAndPrintNumbersInNaturalOrder(List<Integer> numberList)
	{
		//sort the numbers in natural sorting order
		Collections.sort(numberList);
		System.out.println("Sorted list: " + numberList);
	}
	
	private static void sortAndPrintInDescendingOrder(List<Integer> numberList) 
	{
		Collections.sort(numberList);
		Collections.reverse(numberList);
		
		System.out.println("Numbers in descending order: " +numberList.toString());
	}
}
