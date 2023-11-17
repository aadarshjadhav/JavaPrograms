package diwalitest3;

public class Employee extends Member{
	
	String specialization;

    // Parameterized constructor for Employee
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}
