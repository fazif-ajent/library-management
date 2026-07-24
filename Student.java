public class Student {

    private int studentId;
    private String studentName;
    private String department;

    public Student(int studentId, String studentName, String department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void displayStudent() {
        System.out.println("---------------------------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Department   : " + department);
        System.out.println("---------------------------");
    }
}