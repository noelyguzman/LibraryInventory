import java.time.LocalDate;
public class Book {
    private String title;
    private boolean isCheckedOut;
    private String checkedOutBy;
    private LocalDate checkOutDate;
    private LocalDate dueDate;

    public Book(String title) {
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutBy = null;
        this.checkOutDate = null;
        this.dueDate = null;
    }

    // Getter and Setter methods for each field
    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutBy() {
        return checkedOutBy;
    }

    public void setCheckedOutBy(String checkedOutBy) {
        this.checkedOutBy = checkedOutBy;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    // Method to print the book's details
    public void printDetails() {
        System.out.println("\"" + title + "\" - " + (isCheckedOut ? "Checked out by " + checkedOutBy + " on " + checkOutDate + " due by " + dueDate : "On shelf"));
    }
}
