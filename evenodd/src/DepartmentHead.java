import java.util.Scanner;

interface DeptEmployee {
    void getDetails();
}

interface DeptManager extends DeptEmployee {
    void getDeptDetails();
}

class DepartmentHead implements DeptManager {

    int empId;
    String empName;
    int deptId;
    String deptName;

    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.print("Enter employee id - ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name - ");
        empName = sc.nextLine();
    }

    public void getDeptDetails() {
        System.out.print("Enter department id - ");
        deptId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department name - ");
        deptName = sc.nextLine();
    }

    void display() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }

    public static void main(String[] args) {
        DepartmentHead dh = new DepartmentHead();
        dh.getDetails();
        dh.getDeptDetails();
        dh.display();
    }
}
