import java.util.Scanner;

class Person {
    private String name;
    private String contactNum;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getContactNum() {
        return contactNum;
    }
}

class Employee extends Person {
    private double salary;
    private String department;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

class Faculty extends Employee {
    private boolean isRegular;

    public void setRegular(boolean isRegular) {
        this.isRegular = isRegular;
    }

    public boolean isRegular() {
        return isRegular;
    }
}

class Student extends Person {
    private String program;
    private int yearLevel;

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public int getYearLevel() {
        return yearLevel;
    }
}

public class CollegeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter E for Employee, F for Faculty, or S for Student:");
        char choice = sc.next().charAt(0);

        while (choice != 'E' && choice != 'F' && choice != 'S') {
            System.out.println("Invalid choice. Please enter E for Employee, F for Faculty, or S for Student:");
            choice = sc.next().charAt(0);
        }

        System.out.println("Enter Name:");
        sc.nextLine();  
        String name = sc.nextLine();
        System.out.println("Enter Contact Number:");
        String contactNum = sc.nextLine();

        if (choice == 'E') {
            Employee employee = new Employee();
            employee.setName(name);
            employee.setContactNum(contactNum);
            System.out.println("Enter Salary:");
            double salary = sc.nextDouble();
            System.out.println("Enter Department:");
            sc.nextLine();  
            String department = sc.nextLine();

            employee.setSalary(salary);
            employee.setDepartment(department);

            System.out.println("---------------------------------------------------");
            System.out.println("Name: " + employee.getName());
            System.out.println("Contact Number: " + employee.getContactNum());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Department: " + employee.getDepartment());

        } else if (choice == 'F') {
            Faculty faculty = new Faculty();
            faculty.setName(name);
            faculty.setContactNum(contactNum);
            System.out.println("Is the faculty member regular/tenured? (Y/N):");
            char regular = sc.next().charAt(0);
            faculty.setRegular(regular == 'Y' || regular == 'y');

            System.out.println("Faculty Details:");
            System.out.println("Name: " + faculty.getName());
            System.out.println("Contact Number: " + faculty.getContactNum());
            System.out.println("Status: " + (faculty.isRegular() ? "Regular" : "Non-Regular"));

        } else if (choice == 'S') {
            Student student = new Student();
            student.setName(name);
            student.setContactNum(contactNum);
            System.out.println("Enter Program:");
            String program = sc.nextLine();
            student.setProgram(program);
            
            System.out.println("Enter Year Level (1-4):");
            int yearLevel = sc.nextInt();

            student.setProgram(program);
            student.setYearLevel(yearLevel);

            System.out.println("Student Details:");
            System.out.println("Name: " + student.getName());
            System.out.println("Contact Number: " + student.getContactNum());
            System.out.println("Program: " + student.getProgram());
            System.out.println("Year Level: " + student.getYearLevel());
        }

    }
}
