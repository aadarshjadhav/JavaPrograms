package ClassWork;
// Encode every character by successive third character 
import java.util.Arrays;
import java.util.Scanner;

public class CodingRound {
	
	public static void replaceThird(String str)
	{
		char str_array[]= str.toCharArray();
		
		for(int i=0;i<str_array.length;i++)
		{
			if(str_array[i]<'x')
			{
				str_array[i]=(char)(str_array[i]+3);
			}
			else if(str_array[i]== 'x')
			{
				str_array[i]='a';
			}
			else if(str_array[i]== 'y')
			{
				str_array[i]='b';
			}
			else if(str_array[i]== 'z')
			{
				str_array[i]='c';
			}
			
		}
		
		System.out.println(Arrays.toString(str_array));
		
	}
	
	public static void replaceRecursive(String str)
	{
		char str_array[]= str.toCharArray();
		
		for(int i=0;i<str_array.length;i++)
		{
			if(str_array[i]<'x')
			{
				str_array[i]=(char)(str_array[i]+3);
			}
			else 
			{
				str_array[i]=(char)((str_array[i]-23));
				
			}
		}
		System.out.println(Arrays.toString(str_array));
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter the name:");
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		
		replaceThird(str);
		replaceRecursive(str);
		
	}

}
