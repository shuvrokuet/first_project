package ArrayListFunction;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		
//		for (String l : list) {
//			System.out.println(l);
//		}
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			Object element = it.next();
	        System.out.println(element);
			//System.out.println(it);
		}
		
		System.out.println("Removing the element");
		list.remove("aa");
		
		for (String l : list) {
			System.out.println(l);
		}
		
		System.out.println("add element in new index");
		 list.add(3,"kuet");
		 
		 for (String l : list) {
				System.out.println(l);
			}
		 
		 //how to know the index number
		 
		 int pos = list.indexOf("bb");
		 System.out.println("The index of Item2 is: " + pos);
		 
		 //replacing an element
	        list.set(1, "NewItem");
	    System.out.println("After replacing ");
	    for (String l : list) {
			System.out.println(l);
		}
	    
	        
	}

}
