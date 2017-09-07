package javaCollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//saves along with the index
public class hashMap {
public static void main(String args[]){
	HashMap<Integer, String> hm=new HashMap<Integer,String>();
	//Q: enter the ele
	hm.put(0, "harish");
	hm.put(1, "sunny");
	hm.put(10, "india");
	//Q:get ele from index
	System.out.println(hm.get(2));
	System.out.println(hm);
	
	//Q:remove ele
	hm.remove(10);
	System.out.println(hm);
	
	//Q:hashmap as set//move to different collection interface
	 Set sn=hm.entrySet();
	 System.out.print(sn);
	 
	Iterator it=sn.iterator();
	while(it.hasNext()){
		Map.Entry mp=(Map.Entry)it.next();//div key and value
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
	}
}
}