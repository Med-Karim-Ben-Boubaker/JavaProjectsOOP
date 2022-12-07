package JavaProjects.TP2;

import JavaProjects.TP2.Excercice1.Employee;
import JavaProjects.TP2.Excercice2.ArrayList;
import java.util.Scanner;

/*This main class will build an array of employee objects by
using the classes Employee and ArrayList.*/
public class Main {
    public static void main(String[] args) {
        ArrayList Employees = new ArrayList(3);
        Scanner scanner = new Scanner(System.in);
        int id, salary; String name;

        for(int i=0; i<Employees.size(); i++){

            System.out.println("Enter ID");
            id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter Salary");
            salary = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter Name");
            name = scanner.nextLine();

            Employee object = new Employee(id, name, salary);

            Employees.add(i, object);

        }
        for(int i=0; i<Employees.size(); i++){
            System.out.println(Employees.get(i).toString());
        }

        //Preventing the problem of resource leakage
        scanner.close(); 
    }
    
}
