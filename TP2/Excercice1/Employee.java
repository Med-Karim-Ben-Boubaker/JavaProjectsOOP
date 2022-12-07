package JavaProjects.TP2.Excercice1;

import java.lang.String;

public class Employee{
    private int id;
    private String fullName;
    private int salary;

    //Defining constructor
    public Employee(int id, String fullName, int salary){
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    //Defining methodes of class Employee
    public int getID(){
        return id;
    }
    
    public String getFirstName(){
        String firstName = "";
        int i = 0;
        while(fullName.charAt(i) != ' '){
            i++;
        }
        int spaceIndex = i;
        firstName = fullName.substring(0, spaceIndex);

        return firstName;
    }

    public String getLastName(){
        String lastName = "";
        int i=0;

        while(fullName.charAt(i) != ' '){
            i++;
        }
        int spaceIndex = i;
        lastName = fullName.substring(spaceIndex+1, fullName.length());

        return lastName;
    }

    String getFullName(){
        return fullName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return 12*salary;
    }

    //Setting a new salary based on a percentage increase
    public void raiseSalary(int percent){
        salary += (salary*percent/100);
    }

    //Using the toString function to display information about an object
    public String toString(){
        return "Information about this employee: \nfull name: "+fullName+
        "\nid: "+id+"\nSalary: "+salary;
        
    }
}
