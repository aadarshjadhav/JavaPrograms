package arrays;

public class ArrayDemo {
	
	
	public int[] arrayCreation()
	{
		int arr[]= {1,2,3,4,5};
		return arr;
	}
	
	public void arrayReverse(int arrb[])
	{
		int brr[]= new int[5];
	
		int j=4;
		
		for(int i=0;i<arrb.length;i++)
		{
			brr[j]=arrb[i];
			--j;
		}
		
		this.showAarrayElement(brr);
		
	}
	public void showAarrayElement(int arrshow[])
	{
		for(int i=0;i<arrshow.length;i++)
			System.out.println(arrshow[i]);
	}

	public static void main(String args[])
	{
		ArrayDemo a=new ArrayDemo();
		int array[]=a.arrayCreation();
		
		a.arrayReverse(array);
	}
}
