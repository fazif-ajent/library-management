public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(101, "Java Programming", "James Gosling");
        Book book2 = new Book(102, "Data Structures", "Mark Allen");

        Student student = new Student(1, "Fazura begum", "CSE");

        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");

        System.out.println("\nBook Details");
        book1.displayBook();
        book2.displayBook();

        System.out.println("\nStudent Details");
        student.displayStudent();

        System.out.println("\nBook Issued Successfully!");

        book1.setIssued(true);

        System.out.println("\nUpdated Book Status");
        book1.displayBook();
    }
}