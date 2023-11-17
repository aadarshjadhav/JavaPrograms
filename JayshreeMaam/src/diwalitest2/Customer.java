package diwalitest2;

import java.util.Scanner;

public class Customer {
	
	private int customerId;
    private String customerName;
    private String customerAddress;

    // Constructor
    public Customer(int customerId, String customerName, String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    // Getter methods
    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    // Setter methods
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    // Method to create a backup by passing the object as a parameter
    public static Customer createBackup(Customer original) {
        
    	//original = new Customer(original.customerId, original.customerName,original.customerAddress);
    	return original;
    	
    	//return new Customer(original.customerId, original.customerName, original.customerAddress);
    }

    // Method to create a backup without passing the object as a parameter
    public Customer createBackup() {
       
    	//return this;
    	return new Customer(this.customerId, this.customerName, this.customerAddress);
    }
    
    public String toString()
    {
    	return " Id:"+ customerId+ " Name:"+ customerName+ " Address:"+customerAddress ;
    }

    // Main method to demonstrate creating a customer object and its backup
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get customer details from the user
        System.out.println("Enter Customer ID:");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.println("Enter Customer Name:");
        String customerName = scanner.nextLine();
        System.out.println("Enter Customer Address:");
        String customerAddress = scanner.nextLine();

        // Create a customer object
        Customer customer = new Customer(customerId, customerName, customerAddress);

        // Create a backup by passing the object as a parameter
        Customer backup1 = createBackup(customer);

        // Create a backup without passing the object as a parameter
        Customer backup2 = customer.createBackup();

        System.out.println(backup1);
        System.out.println(backup2);

     
    }

    
}

