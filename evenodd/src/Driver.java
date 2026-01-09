import java.util.Scanner;
abstract class student {
    int rollno;
    long regno;

    void getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rollno: ");
        rollno = sc.nextInt();
        System.out.print("Enter Registration no: ");
        regno = sc.nextLong();
    }
    abstract void course();
}

class kiitian extends student {

    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
    void display() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        course();
    }
}

public class Driver {
    public static void main(String[] args) {
        kiitian k = new kiitian();
        k.getinput();
        k.display();
    }
}
