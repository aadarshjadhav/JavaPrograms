package com.exceptiondemos;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Multiple_Catch_Blocks {
		
	public static void main(String args[])
	{	
		try 
		{
			file= new FileInoutStream(fileName);
			x= (byte) file.read();
		}
		catch(IOException i)
		{
			i.printStackTrace();
			return -1;
		}
		catch(FileNotFoundException f)
		{
			f.printStackTrace();
			return -1;
		}
	}

}
