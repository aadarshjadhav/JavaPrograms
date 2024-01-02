package com.finaltestpractices;

class UseAbstract extends QuestionAbstractClass {
		public  int abstractMethod()
			{
				return 0;
			}
	public void abstractMethod1()
	{
			System.out.println("This is abstract method1");
	}
	public static void main(String s[])
	{
			UseAbstract o = new UseAbstract();
			System.out.println(o.abstractMethod());
			o.abstractMethod1();
	}
}

