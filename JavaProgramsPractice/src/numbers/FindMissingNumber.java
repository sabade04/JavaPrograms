package numbers;

import java.util.ArrayList;

public class FindMissingNumber {
	
	
	public static void main(String[] args)
	{
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<=100; i++)
		{
			if(i!=66)
			{
			arr.add(i);
			}
		}
		System.out.println(arr);
		findMissingNum(arr);
	}
	
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
	
	
	

}
