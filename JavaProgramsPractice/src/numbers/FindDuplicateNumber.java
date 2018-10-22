package numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Find duplicate number/s in given array/arraylist
 */

public class FindDuplicateNumber {
	
	
	public static void findDupNum(List<Integer> numbers)
	{
	 System.out.println("Numbers in the list are:" +numbers);
	  
	 Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
	  
	    for(Integer num: numbers)
	    {
	    	
	    	if(myMap.containsKey(num))
	    	    myMap.put(num, myMap.get(num)+1);
	    	else	
	    	  myMap.put(num, 1);
	    	
	    }
		
	   System.out.println("Print Map:"+myMap); 
		
	   for(Integer key : myMap.keySet())
	   {
		   if(myMap.get(key)>1)
		   {
			   System.out.println("duplicate number is/are :" +key);
		   }
			   
	   }
	    
	} 
	   
	public static void main(String[] args)
	  {
		   
	    List<Integer> myList = new ArrayList<Integer>();
	    myList.add(2);
	    myList.add(4);
	    myList.add(5);
	    myList.add(3);
	    myList.add(3);
	    myList.add(88);
	    myList.add(100);
	    myList.add(88);
	    
	    
	   findDupNum(myList);
	  
	  }
	   
	   
	    

	
	

}
 