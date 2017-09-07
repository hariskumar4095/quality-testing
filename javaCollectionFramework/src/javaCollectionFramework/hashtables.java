package javaCollectionFramework;

import java.util.Hashtable;

public class hashtables {
	

	public static void main(String args[]){
			//difference between hash map and hash table
		// hash map-synchronized.-can be used when multiple prog run at a time
			//-not so secured
		
		//hash table-non sync-1 prog is running. so other prog should be waiting
		   // -secured
		    Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
			//Q: enter the ele
			ht.put(0, "harish");
			ht.put(1, "sunny");
			ht.put(10, "india");
			//Q:get ele from index
			System.out.println(ht.get(2));
			System.out.println(ht);
			
			//Q:remove ele
			ht.remove(10);
			System.out.println(ht);
	}
		

	}


