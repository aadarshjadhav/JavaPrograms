package diwalitest3;

public class Manager extends Member {
	
	 // Additional data members for Manager
    String department;

    // Parameterized constructor for Manager
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

}
