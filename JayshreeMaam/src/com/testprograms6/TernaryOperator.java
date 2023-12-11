package com.testprograms6;

/*Convert to ternary?			
if(a>b)	
{	
	if(a>c)
		g=a;
	else		
		g=c;
}
else	
{		
	if(b>c)	
		g=b;
	Else		
		g=c;
}*/

public class TernaryOperator {
	
	public static void main(String args[])
	{
		int a=0,b=0,c=0,g=0;
		
		g=(a>b)?((a>c)?a:c ):((b>c)? b:c);
	}

}
