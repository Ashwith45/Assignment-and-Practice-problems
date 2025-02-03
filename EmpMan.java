import java.util.Scanner;

abstract class Employee{
String name ;
int employeeId;

  
  abstract void calculateSalary();
  public void displayDetails(){

    System.out.println("Name of The Employee : " +name );
    System.out.println("Employee Id : " +employeeId);
  };
  
}
class FullTimeEmployee extends Employee {
    public void calculateSalary() {
       System.out.println("Salary for the Full Time Employee is 24000");
    }
    public void empdisplayDetails(String name, int employeeId) {
        this.name=name;
        this.employeeId=employeeId;
        displayDetails();
    
    }
        
    
 
}
class PartTimeEmployee extends Employee {
    
    public void calculateSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Worked hours of Part Time Employee : ");
        int hours = sc.nextInt();
        System.out.println("Salary for the Part Time Employee is : " +100*hours);
    }
    public void empdisplayDetails(String name ) {
        this.name=name;
        
        displayDetails();
    
       }
    

}





public class EmpMan {
    public static void main(String[] args) {
    
        
        FullTimeEmployee fe= new FullTimeEmployee();
        fe.empdisplayDetails("Ashwith",45);
        fe.calculateSalary();
        PartTimeEmployee pe = new PartTimeEmployee();
        pe.empdisplayDetails("Rohit");
        pe.calculateSalary();

                    
        
    }

    
}
