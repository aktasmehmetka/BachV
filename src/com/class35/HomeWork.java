package com.class35;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HomeWork {

	/*
	 * Create a map of Best Buy store. Place item id and item name into it. Example
	 * (7664847 = Printer, 7879885= TV etc )
	 * 
	 * Retrieve all keys and values from a Best Buy map using EntrySet.
	 * 
	 */

	public static void main(String[] args) {

		Map<Integer, String> bestBuy = new HashMap<>();
		bestBuy.put(1259, "Refrigerator");
		bestBuy.put(1000, "TV");
		bestBuy.put(3654, "Oven");
		bestBuy.put(4538, "washer");
		bestBuy.put(658, "Game Box");
		
		Set<Entry<Integer, String>> setBuy=bestBuy.entrySet();
		 System.out.println("--for each--");
		 for(Entry<Integer, String> i:setBuy) {
	            System.out.println(i.getKey()+" = "+i.getValue());
	        }
		 System.out.println("==iterator==");
	        Iterator<Entry<Integer, String>> it=setBuy.iterator();
	        while(it.hasNext()) {
	            Entry<Integer, String> ee=it.next();
	            System.out.println( ee.getKey()+" = "+ee.getValue());

	        }
	}
}
