package diwalitest3;

public class Member {
	
	// Data members
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Parameterized constructor
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

}
