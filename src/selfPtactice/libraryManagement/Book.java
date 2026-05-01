package selfPtactice.libraryManagement;

public class Book {
    int bookID;
    String author;
    String title;
    boolean isAvailable;

    public Book(int bookID, String author, String title) {
        this.bookID = bookID;
        this.author = author;
        this.title = title;
        this.isAvailable = true;
    }
    void setUnavailable(){
        isAvailable=false;
    }
    void setAvailable(){
        isAvailable=true;
    }

}
