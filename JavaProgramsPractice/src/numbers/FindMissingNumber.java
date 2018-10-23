package numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
 * This java program is to find missing number from array
 */

public class FindMissingNumber {
	
	
	public static void main(String[] args)
	{
		int count=100;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<=count; i++)
		{
			if(i!=60 && i!=40 && i!=100)
			{
			arr.add(i);
			}
		}
		System.out.println(arr);
		//findMissingNum(arr);
		findMissingNumUsingMap(arr, count);
	}
	
	/* Below method only works for 1 missing number */
	public static void findMissingNum(ArrayList<Integer> a)
	{
		int len = a.size();
		int actualTotal = 0;
		int total = 0;
		for(int j=1;j<=len;j++)
		{
			actualTotal = actualTotal + j;
		}
		System.out.println("Actual Total:" + actualTotal);
		
		for(int i=1 ;i<len;i++)
		{
			total = total + a.get(i);	
		}
		System.out.println("Total from array:" + total);
		System.out.println("Missing number is:" + (actualTotal-total));
				
		
	}
	
	/*Below method works for any missing numbers*/
	public static void findMissingNumUsingMap(ArrayList<Integer> numbers, int count)
	{
		
		Map<Integer,Integer> myMap = new HashMap<Integer, Integer>();
		
		for(Integer num: numbers)
		{
		  
		   myMap.put(num, 1);
			 
		}
		
		System.out.println("Map is:" + myMap);
		for(int i=0;i<=count;i++)		
		{
			if(myMap.get(i)==null)
			{
				System.out.println("Missing Number is:" + i);
			}
		}
		
		
	}

}
