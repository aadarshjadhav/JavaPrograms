package diwalitest4;

	abstract class Abs
	{
	    abstract void abstractMethod();
	    {
	        System.out.println("First Method");
	    }
	}
	public class InstanceInitAbstarct extends Abs
	{
		void abstractMethod()
		{
			System.out.println("This is my implementation");
		}
		public static void main(String s[])
		{
			InstanceInitAbstarct ab = new InstanceInitAbstarct();
			ab.abstractMethod();
		}
	 }

