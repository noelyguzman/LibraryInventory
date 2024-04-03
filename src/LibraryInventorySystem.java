import java.util.HashMap;
/*
        I am from light, smiles, and kindness .
        I am from RD, martial arts, and my beautiful pets.
        I am special experience that defines me.
        I am from my love for travelling and animals.
*/
/*
PROMPT:
    Imagine you are a librarian and want to develop an inventory management system that keeps track of which books are in the library and which ones have been checked out.
    Write a program  with the following functionality:

            The user can print out a list of each book and its status (“on shelf” or “checked out”)
            The user can add new books to the inventory. The default status of newly added books will be “on shelf”
            The user can toggle the status of each book between “on shelf” and “checked out”

            The user should interact with the program using the command line interface. When you write your program, you should also consider its overall design.
            Your solution can be in a language of your choosing. If you have time, think about what other functionality you might add.
            Try to implement it for an extra challenge!
*/

public class LibraryInventorySystem {
    private final HashMap<String, Boolean> books;

    //true - checked out
    //false - on shelf
    public LibraryInventorySystem() {
        this.books = new HashMap<>();
    }

    public void printBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the inventory.");
            return;
        }
        for (String book : books.keySet()) {
            System.out.println(book + " - " + (books.get(book) ? "Checked out" : "On shelf"));
        }
    }

    public void addBook(String title) {
        books.put(title, false);
        System.out.println(title + " added to the inventory.");
    }
//    public void addBook(String title) {
//        books.put(title, new Book(title));
//        System.out.println("\"" + title + "\" has been added to the inventory.");
//    }
    public void toggleBookStatus(String title) {
        if (!books.containsKey(title)) {
            System.out.println("Book not found in inventory.");
            return;
        }
        books.put(title, !books.get(title));
        System.out.println(title + " status changed to " + (books.get(title) ? "Checked out" : "On shelf"));
    }
//    public void toggleBookStatus(String title, String userName, LocalDate date) {
//        Book book = books.get(title);
//        if (book == null) {
//            System.out.println("Book not found.");
//            return;
//        }
//        if (book.isCheckedOut()) {
//            book.setCheckedOut(false);
//            book.setCheckedOutBy(null);
//            book.setCheckOutDate(null);
//            book.setDueDate(null);
//            System.out.println("\"" + title + "\" has been checked in.");
//        } else {
//            book.setCheckedOut(true);
//            book.setCheckedOutBy(userName);
//            book.setCheckOutDate(date);
//            book.setDueDate(date.plusWeeks(2)); // Assuming a 2-week lending period
//            System.out.println("\"" + title + "\" has been checked out by " + userName + ".");
//        }
//    }
}