package diwalitest3;

public class Application {
	
	String version;
	String technologyUsed;
	
	public Application()
	{
		
	}
	
	public Application(String version, String technologyUsed)
	{
		this.version=version;
		this.technologyUsed=technologyUsed;
	}
	
	public void createSetup()
	{
		System.out.println("Setting up the application...");
	}

	public void displayDetails() 
	{
        System.out.println("Version: " + version);
        System.out.println("Technology Used: " + technologyUsed);
    }
}
