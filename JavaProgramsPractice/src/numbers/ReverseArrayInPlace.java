package numbers;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayInPlace {

	
	public static void reverseInplace(List<Integer> a)
	{
		int len = a.size();
		int lastEle = a.size()-1;
		int temp =0 ;
		
		System.out.println("Before reverse:"+ a);
		System.out.println("remainder:"+len%2);
		   for(int i=0; i<len/2;i++)
		   {
			temp = a.get(i); // first element in temp variable
			a.set(i,a.get(lastEle-i));// set last element to 1st index
		    a.set(lastEle-i, temp);
		   }
		
		System.out.println("After reverse:"+ a);
   }
	
	public static void main(String[] args)
	{
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(4);
		arr.add(6);
		arr.add(8);
		arr.add(10);
		arr.add(12);
		
		reverseInplace(arr);
		
	}
	
	
	
	
	
}
