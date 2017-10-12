

package com.arghya;
import java.util.HashMap;
import java.util.Map.Entry;
public class Map1 {

	public static void main(String[] args) {
		//No order..
		HashMap<Integer,String> m1=new HashMap<Integer,String>();
		
		m1.put(10640656, null);
		m1.put(10640556,null);
		m1.put(10640546,"Rabin Kumar");
		m1.put(10640506,"Pradeep C ");
		m1.put(10640506,"Puja nandhi");
		
		System.out.println("----Obj-------"+m1);
		m1.remove(10640546);
		System.out.println("After Remove"+m1);
		/*for(Entry<Integer, String> m:m1.entrySet()){  
			//System.out.println(m);
			 System.out.println(m.getKey()+" ..... "+m.getValue());  
			  }  */
		
		
		
		
		

	}

}
