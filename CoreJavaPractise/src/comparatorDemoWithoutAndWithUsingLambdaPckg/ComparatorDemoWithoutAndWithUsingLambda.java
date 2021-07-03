package comparatorDemoWithoutAndWithUsingLambdaPckg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemoWithoutAndWithUsingLambda
{

	public static void main(String[] args)
	{
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(234);
		numberList.add(151);
		numberList.add(276);
		numberList.add(879);
		numberList.add(345);
		
		System.out.println("Existing list: " +numberList.toString());
		
		sortAndPrintTheListBasedOnTheLastDigitOfEachNumberWithoutLambda(numberList);
		
		sortAndPrintTheListBasedOnTheLastDigitOfEachNumberUsingLambda(numberList);
		
	}
	
	
	private static void sortAndPrintTheListBasedOnTheLastDigitOfEachNumberWithoutLambda(List<Integer> numberList)
	{
		Comparator<Integer> comparator = new Comparator<Integer>()
		{			
			@Override
			public int compare(Integer o1, Integer o2)
			{
				if(o1 % 10 > o1 % 10)
					return 1;						// returning 1 means swap
				
				else if(o1 % 10 < o2 % 10)
					return -1;
				
				else
					return 0;
			}
		};		
		
		Collections.sort(numberList, comparator);
		
		System.out.println("Sorted numbers without using Lambda: " +numberList.toString());		//Sorted numbers without using Lambda: [151, 234, 345, 276, 879]
		
	}
	
	//Using lamnda, the same functionality was achieved by just 2 lines of code
	private static void sortAndPrintTheListBasedOnTheLastDigitOfEachNumberUsingLambda(List<Integer> numberList)
	{		
		Collections.sort(numberList,(i,j) -> (i%10>j%10)?1:(i%10<j%10)?-1:0);
		
		System.out.println("Sorted numbers using Lambda: " +numberList.toString());			//Sorted numbers using Lambda: [151, 234, 345, 276, 879]
		
	}

}
