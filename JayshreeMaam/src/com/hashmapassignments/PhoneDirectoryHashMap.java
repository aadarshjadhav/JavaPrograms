package com.hashmapassignments;

//WAP Phone Directory application in java using a Map.
//The phone directory should allow users to:
//
//Add a contact with a name and phone number.
//Remove a contact by name.
//Retrieve the phone number associated with a given name.
//Display the entire phone directory.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PhoneDirectoryHashMap {
	
	public static void main(String args[])
	{
		ArrayList<PhoneNumber> number_list= new ArrayList<PhoneNumber>();
		number_list.add(new PhoneNumber(9999999999l));
		number_list.add(new PhoneNumber(8888888888l));
		
		//HASHMAP
		HashMap<PersonName,ArrayList<PhoneNumber>> phone_map= new HashMap<PersonName,ArrayList<PhoneNumber>>();
		
		phone_map.put(new PersonName("Aadarsh"), number_list);
		
		ArrayList<PhoneNumber> number_list2= new ArrayList<PhoneNumber>();
		number_list2.add(new PhoneNumber(7777777777l));
		number_list2.add(new PhoneNumber(6666666666l));
		
		phone_map.put(new PersonName("Rohit"), number_list2);
		
		ArrayList<PhoneNumber> number_list3= new ArrayList<PhoneNumber>();
		number_list3.add(new PhoneNumber(5555555555l));
		number_list3.add(new PhoneNumber(4444444444l));
		
		phone_map.put(new PersonName("Abhishek"), number_list3);
		
		ArrayList<PhoneNumber> number_list4= new ArrayList<PhoneNumber>();
		number_list4.add(new PhoneNumber(3333333333l));
		number_list4.add(new PhoneNumber(2222222222l));
		
		phone_map.put(new PersonName("Batman"), number_list4);
		
		Set<Entry<PersonName,ArrayList<PhoneNumber>>> set=phone_map.entrySet();
		Iterator<Entry<PersonName,ArrayList<PhoneNumber>>> itr=set.iterator();
		
		while(itr.hasNext())
		{
			Entry<PersonName,ArrayList<PhoneNumber>> element=itr.next();
			PersonName p= element.getKey();
			
			System.out.println("Name:"+p+ " phone:"+ element.getValue());
		}
		
		//Add a contact with name and number;
		
		
		System.out.println();
		System.out.println("___________MENU__________:");
		System.out.println("1.Add contact with a name and phone number");
		System.out.println("2.Remove a contact by name");
		System.out.println("3.Retrieve the phone number associated with a given name");
		System.out.println("4.Display the entire phone directory."); 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose the Option from above:");
		int option= sc.nextInt();
		
		String name;
		long contact;
		
		
		switch(option)
		{
			case 1:	System.out.println("Enter the name:");
					name=sc.next();
					System.out.println("Enter the contact:");
					contact=sc.nextLong();
					ArrayList<PhoneNumber> number_list_temp= new ArrayList<PhoneNumber>();
					number_list_temp.add( new PhoneNumber(contact));
					phone_map.put(new PersonName(name), number_list_temp);
				
					break;
					
			case 2: System.out.println("Enter the name you want to remove:");
					name=sc.next();
					phone_map.remove(name);
					
					break;
						
			case 3: System.out.println("Enter the name to get phone number:");
					name=sc.next();
					PersonName obj =new PersonName(name);
					//String str= obj.getName();
					
					System.out.println("Contact:"+phone_map.get(obj));
					
					break;
			
			case 4: System.out.println("Entire Phone Directory:");
					for(Map.Entry<PersonName, ArrayList<PhoneNumber>> i:phone_map.entrySet())
						System.out.println(i);
					break;
					
			default: System.out.println("You entered wrong option!!!");
		}
		
		
		
		
		
	}

	
}
