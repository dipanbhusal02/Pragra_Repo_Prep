package selfPtactice.libraryManagement;

import java.util.ArrayList;

public class User {
    private int userID;
    private String name;
     ArrayList<Book> borrowedBooks;

    public User(String name, int userID) {
        this.name = name;
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }
}
