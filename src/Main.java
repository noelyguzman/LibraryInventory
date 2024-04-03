import java.util.Scanner;
/*
Additional Features that I could add:
1) Implementing a check-in/check-out system by date.
2) Tracking who has checked out a book.
    I could implement te above two by possibly creating a Book class that includes all of the above features (date, user, title, and due date)
3) Allowing search by book attributes like author, genre, etc.
4) Implementing a GUI for a more user-friendly interface.
*/
public class Main {
    //15 minutes time limit to present
    public static void main(String[] args) {
        LibraryInventorySystem system = new LibraryInventorySystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCommands: print, add <title>, toggle <title>, exit");
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            String[] commands = input.split(" ", 2);
            String command = commands[0];

            switch (command.toLowerCase()) {
                case "print":
                    system.printBooks();
                    break;
                case "add":
                    if (commands.length < 2) {
                        System.out.println("Invalid command. Usage: add <title>");
                        break;
                    }
                    system.addBook(commands[1].toLowerCase());
                    break;
                case "toggle":
                    if (commands.length < 2) {
                        System.out.println("Invalid command. Usage: toggle <title>");
                        break;
                    }
                    system.toggleBookStatus(commands[1]);
                    break;
//                case "toggle":
//                    if (commands.length < 2) {
//                        System.out.println("Invalid command. Usage: toggle <title>");
//                    } else {
//                        Book book = system.getBook(commands[1]); // Assuming there's a method to get a book by title.
//                        if (book != null) {
//                            boolean newStatus = !book.isCheckedOut();
//                            system.toggleBookStatus(commands[1], "Admin", LocalDate.now(), newStatus); // "Admin" and current date as placeholders.
//                        } else {
//                            System.out.println("Book not found.");
//                        }
//                    }
//                    break;
//                case "checkout":
//                    if (commands.length < 4) {
//                        System.out.println("Invalid command. Usage: checkout <title> <user> <YYYY-MM-DD>");
//                    } else {
//                        try {
//                            LocalDate date = LocalDate.parse(commands[3]);
//                            system.toggleBookStatus(commands[1], commands[2], date, true);
//                        } catch (DateTimeParseException e) {
//                            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
//                        }
//                    }
//                    break;
//                case "checkin":
//                    if (commands.length < 2) {
//                        System.out.println("Invalid command. Usage: checkin <title>");
//                    } else {
//                        system.toggleBookStatus(commands[1], null, LocalDate.now(), false);
//                    }
//                    break;
                case "exit":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Unknown command.");
            }
        }
    }
}
