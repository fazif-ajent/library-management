import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String bookName = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String authorName = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        Book book = new Book(bookId, bookName, authorName);
        Student student = new Student(studentId, studentName, department);

        System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");

        System.out.println("\nBook Details");
        book.displayBook();

        System.out.println("\nStudent Details");
        student.displayStudent();

        System.out.println("\nBook Issued Successfully!");

        book.setIssued(true);

        System.out.println("\nUpdated Book Status");
        book.displayBook();

        sc.close();
    }
}