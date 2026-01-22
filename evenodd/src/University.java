class University {

    String universityName;
    String location;

    University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }

    class Department {
        String deptName;
        String hodName;

        Department(String deptName, String hodName) {
            this.deptName = deptName;
            this.hodName = hodName;
        }

        void display() {
            System.out.println("University Name: " + universityName);
            System.out.println("Location: " + location);
            System.out.println("Department Name: " + deptName);
            System.out.println("HOD Name: " + hodName);
        }
    }

    void createDepartment() {
        Department d = new Department("Computer Science", "Dr. Sharma");
        d.display();
    }

    public static void main(String[] args) {
        University u = new University("KIIT University", "Bhubaneswar");
        u.createDepartment();
    }
}
