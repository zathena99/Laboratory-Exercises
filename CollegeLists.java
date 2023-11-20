import java.util.*;

class Person {
    private String name;
    private String contactNumber;

    public Person(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}

class Employee extends Person {
    private double monthlySalary;
    private String department;

    public Employee(String name, String contactNumber, double monthlySalary, String department) {
        super(name, contactNumber);
        this.monthlySalary = monthlySalary;
        this.department = department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getDepartment() {
        return department;
    }
}

class Faculty extends Employee {
    private boolean isRegular;

    public Faculty(String name, String contactNumber, double monthlySalary, String department, boolean isRegular) {
        super(name, contactNumber, monthlySalary, department);
        this.isRegular = isRegular;
    }

    public String getStatus() {
        return isRegular ? "Regular" : "Non-Regular";
    }
}

class Student extends Person {
    private String program;
    private int yearLevel;

    public Student(String name, String contactNumber, String program, int yearLevel) {
        super(name, contactNumber);
        this.program = program;
        this.yearLevel = yearLevel;
    }

    public String getProgram() {
        return program;
    }

    public int getYearLevel() {
        return yearLevel;
    }
}

public class CollegeLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select the category (E for Employee, F for Faculty, S for Student): ");
        String category = sc.nextLine();

        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter contact number: ");
        String contactNumber = sc.nextLine();

        if (category.equals("E")) {
            System.out.println("Enter monthly salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); 
            System.out.println("Enter department: ");
            String department = sc.nextLine();

            Employee employee = new Employee(name, contactNumber, salary, department);
            System.out.println("Employee Information:");
            System.out.println("Name: " + employee.getName());
            System.out.println("Contact Number: " + employee.getContactNumber());
            System.out.println("Monthly Salary: " + employee.getMonthlySalary());
            System.out.println("Department: " + employee.getDepartment());
        } else if (category.equals("F")) {
            System.out.println("Is the faculty member regular (Y/N)? ");
            char regularChar = sc.next().charAt(0);
            boolean isRegular = regularChar == 'Y' || regularChar == 'y';
            sc.nextLine(); 
            System.out.println("Enter department: ");
            String department = sc.nextLine();

            Faculty faculty = new Faculty(name, contactNumber, 0, department, isRegular);
            System.out.println("Faculty Information:");
            System.out.println("Name: " + faculty.getName());
            System.out.println("Contact Number: " + faculty.getContactNumber());
            System.out.println("Status: " + faculty.getStatus());
            System.out.println("Department: " + faculty.getDepartment());
        } else if (category.equals("S")) {
            System.out.println("Enter program: ");
            String program = sc.nextLine();
            System.out.println("Enter year level: ");
            int yearLevel = sc.nextInt();

            Student student = new Student(name, contactNumber, program, yearLevel);
            System.out.println("Student Information:");
            System.out.println("Name: " + student.getName());
            System.out.println("Contact Number: " + student.getContactNumber());
            System.out.println("Program: " + student.getProgram());
            System.out.println("Year Level: " + student.getYearLevel());
        } else {
            System.out.println("Invalid category.");
        }
    }
}
