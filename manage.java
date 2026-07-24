import java.util.Scanner;

class LibraryManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int availableBooks = 10;
        int choice;

        System.out.println("===== Library Management =====");
        System.out.println("1. View Available Books");
        System.out.println("2. Borrow Book");
        System.out.println("3. Return Book");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Available Books : " + availableBooks);
        } 
        else if (choice == 2) {
            if (availableBooks > 0) {
                availableBooks--;
                System.out.println("Book Borrowed Successfully.");
                System.out.println("Available Books : " + availableBooks);
            } else {
                System.out.println("Sorry! No books available.");
            }
        } 
        else if (choice == 3) {
            availableBooks++;
            System.out.println("Book Returned Successfully.");
            System.out.println("Available Books : " + availableBooks);
        } 
        else {
            System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}