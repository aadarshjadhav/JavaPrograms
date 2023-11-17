package diwalitest4;

public class Nature {
	
		enum Season 
		{	
			RAINY,WINTER,SPRING,SUMMER,AUNTOM;
		}
		{
		System.out.println(" Enjoy each season..");
		}
		static
		{
			System.out.println("God is Great!!");
		}
		public static void enjoyClimate(Season s)
		{
			switch(s)
			{
			case WINTER : System.out.println("Use swetor");break;
			case SUMMER : System.out.println("Use cap");
			case RAINY : System.out.println("Use umbrella");break;
			default : System.out.println("No need to use anything special!");
			}
		}
		
		public static void main(String[] args) 
		{
			Season s = Season.SUMMER;
			enjoyClimate(s);	
			
		}
		
}


