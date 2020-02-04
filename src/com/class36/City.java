package com.class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class City {

	/*
	 * Create a Map from array of cities that will sort keys in alphabetical order.
	 * As a key store the name of the city and as a value store the length of the
	 * city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). If any city name
	 * is more than 7 characters remove that city ( use Iterator ).
	 */

	public static void main(String[] args) {

		Map<Integer, String> city = new TreeMap<>();
		city.put(1, "Istanbul");
		city.put(2, "Wahington");
		city.put(3, "Atlanta");
		city.put(4, "Berlin");
		city.put(5, "Moskow");
		city.put(6, "Tashknet");
		
		Set<Entry<Integer, String>> setCity=city.entrySet();
		
		System.out.println(setCity.size());
		
		Iterator<Entry<Integer, String>> entry=setCity.iterator();
				
			while(entry.hasNext()) {
				Entry<Integer, String> ent=entry.next();
				Integer number=ent.getKey();
				String cityName=ent.getValue();
				if(cityName.length()>7) {
					entry.remove();
					
				}
			}
		
			System.out.println(setCity);
	}
}
