package arrays;

public class EnhancedLoopArrays {
	
	 int arr[];
	 
	public EnhancedLoopArrays()
	{
		arr= new int[5];
	}
	
	// You can't assign values in enhanced for loops
	public void asignArray()
	{
		for(int i:arr)
			arr[i]=i;
		for(int i:arr)
			System.out.println(arr[i]);
	}
	public void printArray()
	{
		System.out.println("Values in array:");
		for(int i:arr)
			System.out.println(arr[i]);
	}
	
	public static void main(String args[])
	{
		EnhancedLoopArrays ela= new EnhancedLoopArrays();
		ela.asignArray();
		ela.printArray();
		
	}

}
