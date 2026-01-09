class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student s = (Student) obj;
        return rollNo == s.rollNo && name.equals(s.name);
    }
}
public class CompareStudent {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Gulfam");
        Student s2 = new Student(101, "Gulfam");

        if (s1.equals(s2)) {
            System.out.println("Both students are equal");
        } else {
            System.out.println("Both students are not equal");
        }
    }
}
