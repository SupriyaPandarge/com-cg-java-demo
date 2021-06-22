package com.cg.demo.col;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
	HashMap map=new HashMap<>();
	map.put(10, "One");
	System.out.println("Map : " + map);
	
	map.put(20, "Two");
	System.out.println("Map : " + map);
	System.out.println(map.get(20));
	
	
}
}
