import java.util.Scanner;

class Employee {
    // 1. Declare private fields here
    private String Firstname;
    private String Lastname;
    private int EmployeeId;
    
 
    // 2. Create your constructor here
    public Employee (String Firstname, String Lastname, int EmployeeId) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.EmployeeId = EmployeeId;
    }
    
    // 3. Create your getters and getFullName() method here
    public String getFirstname(){
        return Firstname;
    }
    public String getLastname(){
        return Lastname;
    }
    public int getEmployeeId(){
        return EmployeeId;
    }

    public String getFullname(){
        return Firstname + " " + Lastname;
    }

}

public class Main {
    public static void main(String[] args) {
        // 4. Instantiate your Employee object and print the details
        //Scanner scanner = new Scanner(System.in);
        //System.out.println()

        Employee emp = new Employee("Arcadio", "Rojo", 214241);

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("First name: " + emp.getFirstname());
        System.out.println("Last name: " + emp.getLastname());
        System.out.println("Full name: " + emp.getFullname());


    }
}

/* Expected Output
Employee ID: 1001
First Name: Marco
Last Name: Yimyaem
Full Name: Marco Yimyaem

*/