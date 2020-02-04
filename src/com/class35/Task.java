package com.class35;

import java.util.HashMap;
import java.util.Map;

public class Task {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "Google");
		map.put(2, "FaceBook");
		map.put(3, "Twiter");
		map.put(4, "Google");
		map.put(5, "Syntax");
		map.put(6, "Toyota");
		map.put(7, "Instagram");
		
		System.out.println(map.size());
		System.out.println(map.replace(4, "Geico"));
	}
}
