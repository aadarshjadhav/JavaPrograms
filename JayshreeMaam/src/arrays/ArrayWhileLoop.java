package arrays;

public class ArrayWhileLoop {
	
	//Array Creation
	public void arrayCreation()
	{
		int arr[] = {1,2,3,4,5};
		this.showArrayElements(arr);
	}
	
	//While Loop
	public void showArrayElements(int array[])
	{
		int i=0;
		while(i<array.length)
		{
			System.out.println(array[i]);
			i++;
		}
	}
	
	//Main method
	public static void main(String args[]) 
	{
		ArrayWhileLoop awl = new ArrayWhileLoop();
		awl.arrayCreation();
		
	}

}
