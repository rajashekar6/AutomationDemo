package collectionsjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class looparraylist {
//array list commit
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> ar = new ArrayList<Integer>(
					Arrays.asList(34, 4, 36, 2) );
			
			System.out.println("names are"+ar);
			
	/* For Loop for iterating ArrayList */
			for(int i=0; i<ar.size(); i++)
			{
				System.out.println(ar.get(i));
			}
	
			System.out.println("Advanced");
	 /* Advanced For Loop*/ 	
			for(Integer num : ar){
				System.out.println(num);
			}
	
	
	/* While Loop for iterating ArrayList*/ 	
			 System.out.println("While Loop"); 		
		      int count = 0; 		
		      while (ar.size() > count) {
			 System.out.println(ar.get(count));
		         count++;
		      }
		      
		      
			
	/*Looping Array List using Iterator*/			
		      System.out.println("Iterator");
	
		      Iterator it =	ar.iterator();
		      while(it.hasNext()){
		    	  System.out.println(it.next());
		      }
		      
		      
		      
		      ArrayList<String> c = new ArrayList<String>();
		      c.add("India");
		      c.add("uk");
		      c.add("US");
		      c.add("Soudi"); 
		      c.add("addi");
		      c.add("Avdi");c.add("TG");
		      System.out.println(c);
		      
   /* Sort statement*/
		      Collections.sort(c);
		     // System.out.println(c);
		      
		      System.out.println("After Sorting:");
			   for(String counter: c){
					System.out.println(counter);
				}
			   
			   
			   Collections.sort(c, Collections.reverseOrder());
	   /* Sorted List in reverse order*/
			   System.out.println("ArrayList in descending order:");
			   for(String str: c){
					System.out.println(str);
				}
	// Get the Enumeration object    
			   Enumeration<String> e = Collections.enumeration(c);
			  
			   // Enumerate through the ArrayList elements
			      System.out.println("ArrayList elements: ");		   
			   
			      while(e.hasMoreElements())
			      
			      System.out.println(e.nextElement());
			   
			      int si = c.size();
			      ArrayList<String> csub = new ArrayList<String>(c.subList(0, 3));
			      
			      System.out.println("SubList stored in ArrayList: "+csub);
			      
	//Sublist to List
			      List<String> list =  c.subList(1, 4);
			      System.out.println("SubList stored in List: "+list);
		
			  //c.lastIndexOf		      
	     	      System.out.println("Last occurrence of element 91: "+c.lastIndexOf(91));	  
			  //c.get(2));  
	     	      System.out.println("Third element of the ArrayList: "+c.get(2));  
			  //c.indexOf("EF"))    
	     	      System.out.println("Index of 'EF': "+c.indexOf("EF"));
	     	  //c.contains(1));
	     	     System.out.println("'1' is present in arraylist: "+c.contains("US"));
	
	     	     
	     	     ArrayList<String> c3 = new ArrayList<String>();
	     	    for (String temp : c)
	     	    c3.add(c.contains(temp) ? "Yes" : "No");
	            System.out.println(c3);
	     	     
	     	     
	}

}
/*Note:
The subList method throws IndexOutOfBoundsException – if the specified indexes are out of the range of ArrayList (fromIndex < 0 || toIndex > size).
IllegalArgumentException – if the starting index is greater than the end point index (fromIndex > toIndex).*/
