package com.class36;

import java.util.LinkedHashMap;
import java.util.Map;

public class Person {

	/*
	 * Create a Map that will store Employee name and salary. Write a logic to
	 * retrieve an employee who gets the highest salary. Output should be in the
	 * below format John Smith=$100000
	 */
	
	public static void main(String[] args) {
		
		
		Map<String, Double> mapEmp=new LinkedHashMap<>();
		mapEmp.put("kemal", 4586.36);
		mapEmp.put("Burcu", 65894.36);
		mapEmp.put("Beril", 3664.36);
		mapEmp.put("Zeynep", 3214.36);
		
		System.out.println(mapEmp);
		
		
	}
}
