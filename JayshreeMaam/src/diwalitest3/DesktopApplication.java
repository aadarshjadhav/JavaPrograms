package diwalitest3;

public class DesktopApplication extends Application{
	
	
	public DesktopApplication(String version, String technologyUsed)
	{
		super(version, technologyUsed);
	}
	
	public static void main(String args[])
	{
		Application ap= new DesktopApplication("1.0","2nd Gen");
		ap.displayDetails();
		
	}

}
