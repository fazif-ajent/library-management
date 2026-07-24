public class Book {

    private int bookId;
    private String bookName;
    private String authorName;
    private boolean issued;

    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.issued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public void displayBook() {
        System.out.println("---------------------------");
        System.out.println("Book ID      : " + bookId);
        System.out.println("Book Name    : " + bookName);
        System.out.println("Author Name  : " + authorName);
        System.out.println("Status       : " + (issued ? "Issued" : "Available"));
        System.out.println("---------------------------");
    }
}