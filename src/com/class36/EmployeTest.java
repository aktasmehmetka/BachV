package com.class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EmployeTest {
	

	public static void main(String[] args) {
		
		Map<Integer, Employe> emp=new TreeMap<>();
		emp.put(1, new Employe("Ali", "Kaya", 17, 5000));
		emp.put(2, new Employe("Mustafa", "Cevik", 54, 6000));
		emp.put(3, new Employe("Kemal", "Can", 45, 4000));
		emp.put(4, new Employe("Ayse", "Keskin", 23, 9000));
		
		Set<Entry<Integer, Employe>> entry=emp.entrySet();
		
		
		for(Entry<Integer, Employe> ent:entry) {
			System.out.println(ent.getKey()+"-");
			ent.getValue().display();
		}
//		
//		Iterator<Entry<Integer, Employe>> it=entry.iterator();
//		while(it.hasNext());
//		Entry<Integer, Employe> e=it.next();
//		System.out.println(e.getKey()+"---");
//
//		e.getValue().display();
	}
}
