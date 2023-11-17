package diwalitest3;

public class WebApplication extends Application {
	
	public WebApplication(String version, String technologyUsed)
	{
		super(version, technologyUsed);
	}
	
	public static void main(String args[])
	{
		Application ap= new WebApplication("1.0","3rd Gen");
		ap.displayDetails();
		
	}
}
