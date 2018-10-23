package numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FindSumOfLargestTwoIntegers {
	
	
	
	public static void findSumOfLargestNo(List<Integer> a)
	{
		int lNum= 0;
	    int sLNum = 0;
	    
	    for(int i=0;i<a.size(); i++)
	    {
	    	if(lNum <= a.get(i))
	    	{	    		 
	    		 sLNum = lNum; //move large no to sec large no
	    		 lNum= a.get(i);
	    		
	    	}
	    	if(sLNum < a.get(i) && a.get(i) < lNum)
	    	{
	    		sLNum = a.get(i);
	    	}
	    }
	    
	    System.out.println("Sum is:"+ (sLNum+lNum));
	}
	
	
	public static void main(String[] args)
	{
		
		
		List<Integer> myLi = new ArrayList<Integer>();
		 myLi.add(3);
		 myLi.add(4);
		 myLi.add(6);
		 myLi.add(1);
		 myLi.add(6);
		 
		 findSumOfLargestNo(myLi);
		
	
		
		
		
	}

}
