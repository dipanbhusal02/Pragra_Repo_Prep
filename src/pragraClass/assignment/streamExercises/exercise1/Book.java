package pragraClass.assignment.streamExercises.exercise1;


public class Book {

    private String  title;
    private String  author;
    private String  genre;      // "FICTION", "SCIENCE", "TECHNOLOGY", "HISTORY"
    private int     pages;
    private int     year;
    private boolean available;  // true = on shelf, false = checked out

    public Book(String title, String author, String genre,
                int pages, int year, boolean available) {
        this.title     = title;
        this.author    = author;
        this.genre     = genre;
        this.pages     = pages;
        this.year      = year;
        this.available = available;
    }

    public String  getTitle()     { return title; }
    public String  getAuthor()    { return author; }
    public String  getGenre()     { return genre; }
    public int     getPages()     { return pages; }
    public int     getYear()      { return year; }
    public boolean isAvailable()  { return available; }

    @Override
    public String toString() {
        return title + " by " + author + " [" + genre + ", " + pages + "p]";
    }
}