package com.hashmapassignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import com.hashmapdemo.Employee;

import java.util.Set;
import java.util.Map.Entry;
//WAP to create a map which stores an arraylist as a value

public class DepartmentHashMap {
	
	public DepartmentHashMap()
	{
		
	}
	
	public double findMaxSal(List<Employee> emp_list)
	{
		double max_salary=0;
		for(int i=0;i<emp_list.size();i++)
		{
			if(emp_list.get(i).getSalary()>max_salary)
				max_salary=emp_list.get(i).getSalary();
		}
		return max_salary;
		
	}
	
	public static void main(String args[])
	{
		ArrayList<Employee> emp_list_1= new ArrayList<>();
		
		emp_list_1.add(new Employee(1,"Aadarsh", 69999,1001));
		emp_list_1.add(new Employee(2,"Sudharshan", 60000,1001));
		emp_list_1.add(new Employee(3,"Maroti", 71000,1001));
		
		ArrayList<Employee> emp_list_2= new ArrayList<>();
		emp_list_2.add(new Employee(4,"Ishwar", 24000,1002));
		emp_list_2.add(new Employee(5,"Prashant", 27000,1002));
		emp_list_2.add(new Employee(6,"Suraj", 29000,1002));
		
		ArrayList<Employee> emp_list_3= new ArrayList<>();
		emp_list_3.add(new Employee(7,"Snehal", 24000,1003));
		emp_list_3.add(new Employee(8,"Utkarsha", 28000,1003));
		emp_list_3.add(new Employee(9,"Prabhakar", 24000,1003));
		
		
		HashMap<Department,ArrayList<Employee>> dep_hashmap= new HashMap<Department, ArrayList<Employee>>();
		
		dep_hashmap.put(new Department(1001,"IT","Pune"), emp_list_1);
		dep_hashmap.put(new Department(1002,"QA","Delhi"), emp_list_2);
		dep_hashmap.put(new Department(1003,"HR","Mumbai"), emp_list_3);
		
		
		//1 Display all Department along with their Employees
		
		Set<Entry<Department,ArrayList<Employee>>> set=dep_hashmap.entrySet();
		Iterator<Entry<Department,ArrayList<Employee>>> itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<Department,ArrayList<Employee>> element= itr.next();
			Department dep_obj=element.getKey();
			System.out.println(dep_obj.dep_id+ " "+ dep_obj.getDep_name());
			ArrayList<Employee> array_list_element=element.getValue();
			Iterator<Employee> list_itr=array_list_element.iterator();
			while(list_itr.hasNext())
			{
				System.out.println(list_itr.next());
			}
		}
		
//		Set<Entry<Department,ArrayList<Employee>>> set=dep_hashmap.entrySet();
//		Iterator<Entry<Department,ArrayList<Employee>>> itr= set.iterator();
//		
//		//1 Display all Department along with their Employees
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
//		//2.Find the Maximum salary in each department and display the details of that employee frome each department
//		
//		DepartmentHashMap dep= new DepartmentHashMap();
//		//double max_salary=dep.findMaxSal(emp_list_1);
//		//System.out.println("Maxium sal of emp_list1:"+max_salary);
//		
//		itr=set.iterator(); //Reset iterator position
//		while(itr.hasNext())
//		{
//			Entry<Department,ArrayList<Employee>>etry=itr.next();
//			System.out.println("Department name :"+etry.getKey().getDeptname());
//			ArrayList<Employee> e_list=  etry.getValue();
//			Iterator<Employee> l_iterate= e_list.iterator();
//			//System.out.println(dep.findMaxSal(itr.next().getValue())); 
//			while(l_iterate.hasNext())
//			{
//				Employee e1=l_iterate.next();
//				if(e1.getSalary()==dep.findMaxSal(e_list))
//				{
//					System.out.println(e1);
//				}
//			}
//			
//		}
		
		
		//2.Find the Maximum salary in each department and display the details of that employee frome each department
		
		Set<Entry<Department,ArrayList<Employee>>> set2=dep_hashmap.entrySet(); //Note: set2 is used
		Iterator<Entry<Department,ArrayList<Employee>>> itr2=set2.iterator();	//Note: itr2 is used
		while(itr2.hasNext())
		{
			Entry<Department,ArrayList<Employee>> element= itr2.next();  //Note:Mind the itr2.next();
			Department dep_obj_2=element.getKey();
			System.out.println(dep_obj_2.dep_id+ " "+ dep_obj_2.getDep_name());
			ArrayList<Employee> array_list_element_2=element.getValue();
			Iterator<Employee> list_itr_2=array_list_element_2.iterator();
			
			double max_salary=0;
			Employee e=null;
			while(list_itr_2.hasNext())
			{
				Employee emp_obj=list_itr_2.next();
				if(emp_obj.getSalary()>max_salary)
				{
					max_salary=emp_obj.getSalary();
					e=emp_obj;
				}
			}
			System.out.println(max_salary+ " "+ e);
		}
		
		//3display  all employees from IT departments who is having salary less than 70K
		System.out.println();
		System.out.println("_____________________Employees having less than 70000_________________________");
		Set<Entry<Department,ArrayList<Employee>>>set3=dep_hashmap.entrySet(); //Note:set3 is used
		Iterator<Entry<Department,ArrayList<Employee>>> set_itr3=set3.iterator();
		while(set_itr3.hasNext())
		{
			Entry<Department,ArrayList<Employee>> element=set_itr3.next();
			Department dep_obj=element.getKey();
			if(dep_obj.getDep_name().equals("IT"))
			{
				ArrayList<Employee> array_list_element=element.getValue();
				Iterator<Employee> list_itr_3=array_list_element.iterator();
				while(list_itr_3.hasNext())
				{
					Employee emp_obj=list_itr_3.next();
					if(emp_obj.getSalary()<70000)
						System.out.println(emp_obj);
				}
			}
			
		}
		
		//Display all the employees working in Delhi location
		System.out.println();
		System.out.println("_____________________Employees who are working in Delhi_________________________");
		
		Set<Entry<Department,ArrayList<Employee>>> set4=dep_hashmap.entrySet();
		Iterator<Entry<Department,ArrayList<Employee>>> set_itr4=set4.iterator();
		while(set_itr4.hasNext())
		{
			Entry<Department,ArrayList<Employee>> element=set_itr4.next();
			Department dep_obj=element.getKey();
			
			if(dep_obj.getLocation().equals("Delhi"))
			{
				ArrayList<Employee> array_list_element=element.getValue();
				Iterator<Employee> list_itr_4=array_list_element.iterator();
				while(list_itr_4.hasNext())
				{
					Employee emp_obj=list_itr_4.next();
					System.out.println(emp_obj);
				}
			}
			
		}
		
		
		//4>Add the new employee in Testing department
		System.out.println();
		System.out.println("_____________________Add New Employee QA Department_________________________");
		
		Set<Entry<Department,ArrayList<Employee>>> set5=dep_hashmap.entrySet();
		Iterator<Entry<Department,ArrayList<Employee>>> set_itr5=set5.iterator();
		while(set_itr5.hasNext())
		{
			Entry<Department,ArrayList<Employee>> element=set_itr5.next();
			Department dep_obj=element.getKey();
			
			if(dep_obj.getDep_name().equals("QA"))
			{
				ArrayList<Employee> array_list_element=element.getValue();
				array_list_element.add(new Employee(10,"Prathik", 77000,1002));
				dep_hashmap.put(dep_obj, array_list_element);
				
			}
		}
		Set<Entry<Department,ArrayList<Employee>>> set6=dep_hashmap.entrySet();
		Iterator<Entry<Department,ArrayList<Employee>>> itr6=set6.iterator();
		while(itr6.hasNext())
		{
			Entry<Department,ArrayList<Employee>> element= itr6.next();
			Department dep_obj=element.getKey();
			System.out.println(dep_obj.dep_id+ " "+ dep_obj.getDep_name());
			ArrayList<Employee> array_list_element=element.getValue();
			Iterator<Employee> list_itr=array_list_element.iterator();
			while(list_itr.hasNext())
			{
				System.out.println(list_itr.next());
			}
		}
	
		System.out.println(dep_hashmap.get(new Department(1002,"QA","Delhi")));
	////	System.out.println(dep_hashmap.get(new Department(1002,"QA","Delhi")));
		
		
		//13.WAP to iterate the elements in the arraylist stored in the above Map.()
		System.out.println();
		System.out.println("_____________Iterate the elements in the ArrayLsist stored in the above Map________");
		Set<Entry<Department, ArrayList<Employee>>> set_entries=dep_hashmap.entrySet();
		Iterator<Entry<Department, ArrayList<Employee>>> set_itr=set_entries.iterator();
		while(set_itr.hasNext())
		{
			Entry<Department, ArrayList<Employee>> entry=set_itr.next();
			ArrayList<Employee> array_list=entry.getValue();
			Iterator<Employee> itr_array_list=array_list.iterator();
			System.out.println();
			
			System.out.println("Iterating through arraylist of:"+entry.getKey());
			System.out.println();
			while(itr_array_list.hasNext())
				System.out.println(itr_array_list.next());
		}
		
		//5>Give department details in which maximum number of Employees working.
		System.out.println();
		System.out.println("_____________Department details in which maximum number of Employees________");
		
		Set<Entry<Department, ArrayList<Employee>>> entries_dep=dep_hashmap.entrySet();
		Iterator<Entry<Department, ArrayList<Employee>>> itr_dep_entries=entries_dep.iterator();
		int max_employee_numbers=0;
		Department dep_max=null;
		while(itr_dep_entries.hasNext())
		{
			Entry<Department, ArrayList<Employee>> entry_dep=itr_dep_entries.next();
			Department dep_obj=entry_dep.getKey();
			ArrayList<Employee> array_list_employee=entry_dep.getValue();
			int count=array_list_employee.size();
//			int count=0;
//			Iterator<Employee> itr_array_list=array_list_employee.iterator();
//			while(itr_array_list.hasNext())
//			{
//				itr_array_list.next();
//				count++;
//			}
//			if(count>max_employee_numbers)
//			{
//				max_employee_numbers=count;
//				dep_max=dep_obj;
//			}
//			
//			System.out.println("Department:"+obj+ " has:"+ count);
			
			
			if(count>max_employee_numbers)
			{
				max_employee_numbers=count;
				dep_max=dep_obj;
			}
		}
		
		System.out.println("Department with max number of employees:"+dep_max.getDep_name()+" ="+max_employee_numbers);
		
		
		//6>Find employees whose name start with 'A'
		System.out.println();
		System.out.println("_____________Find employees whose name start with 'A'________");
		Set<Entry<Department, ArrayList<Employee>>> set_entries_2=dep_hashmap.entrySet();
		Iterator<Entry<Department, ArrayList<Employee>>> set_itr_2=set_entries_2.iterator();
		while(set_itr_2.hasNext())
		{
			Entry<Department, ArrayList<Employee>> entry=set_itr_2.next();
			ArrayList<Employee> array_list=entry.getValue();
			Iterator<Employee> itr_array_list=array_list.iterator();
			//System.out.println();
			
			//System.out.println("Iterating through arraylist of:"+entry.getKey());
			//System.out.println();
			while(itr_array_list.hasNext())
			{
				Employee emp_obj=itr_array_list.next();
				char letters[]=emp_obj.getEname().toCharArray();
				
				if(letters[0]=='A')
				{
					System.out.println(emp_obj);
				}
			}
		}
		
	}

}
