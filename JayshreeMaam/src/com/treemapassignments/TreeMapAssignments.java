package com.treemapassignments;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapAssignments {
	
	public static void main(String args[])
	{
		TreeMap<Integer,String> tree_map= new TreeMap<>();
		tree_map.put(21, "Aadarsh");
		tree_map.put(45, "Sudharshan");
		tree_map.put(33, "Ishwar"); 
		tree_map.put(23, "Shalok");
		tree_map.put(65, "Suraj");
		tree_map.put(28, "Abhhishek");
		
		Set<Entry<Integer,String>> set_tree_map=tree_map.entrySet();
		//Search for a Value
		for(Entry<Integer,String> e:set_tree_map)
		{
			if(e.getValue().equals("Aadarsh"))
			{
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
		
		//3.Ceiling key
		System.out.println("CeilingKey:"+tree_map.ceilingKey(23));
		
		//4.DeleteAll Elements
//		System.out.println("Before Deleting Tree Map:"+tree_map);
////		tree_map.clear();
//		System.out.println("After clearing tree map:"+tree_map);
//		
		//5.FirstKey
		System.out.println("First Key:"+tree_map.firstKey());
		
		//6.LastKey
		System.out.println("Last Key:"+tree_map.lastKey());
		
		//7.Floorkey
		System.out.println("Floor key:"+tree_map.floorKey(45));
		
		//8.FloorEntry Key
		System.out.println("The floor key value pair : "+tree_map.floorEntry(33));
		
		//9.Greatest Key value pair and Least Keyvale pair
		
		System.out.println("Greatest key value pair : "+tree_map.lastEntry());
		System.out.println("Lowest key value pair : "+tree_map.firstEntry());

		//10. LowerEntry()
		System.out.println(tree_map.lowerEntry(33));
		
		//
	}

}
