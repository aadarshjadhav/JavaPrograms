package diwalitest2;

import diwalitest3.Application;

public class MobileApplication extends Application{
	
	public MobileApplication(String version, String technologyUsed)
	{
		super(version, technologyUsed);
	}
	
	public static void main(String args[])
	{
		Application ap= new MobileApplication("2.0","4th Gen");
		ap.displayDetails();
		
	}

}
