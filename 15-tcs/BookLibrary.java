import java.util.ArrayList;
import java.util.Scanner;

public class BookLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("Enter no of books: ");
        int b = sc.nextInt();

        // arraylist
        for(int i=0; i<b; i++) {
            System.out.println("Entry book " + (i+1));
            int bookId = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();

            books.add(new Book(bookId, title, author, price));
        }

        // findtotalPrice
        double totalPrice = totalBookPrice(books);
        System.out.println("Total books price:" + totalPrice);

        // find book by title
        System.out.println("Enter book to find: ");
        String findBook = sc.nextLine();
        Book foundBook = findBookByTitle(books, findBook);

        if (foundBook != null) {
        System.out.println("Book exists");
        } else {
        System.out.println("Book not found.");
        }

        sc.close();
    }

    // methods
    public static Book findBookByTitle(ArrayList<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        System.out.println("Book not found");
        return null;
    }

    // totalbookprice
    public static double totalBookPrice(ArrayList<Book> books) {
        if (books.isEmpty()) {
            return 0;
        }
        double totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }
}

class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;

    // constructor
    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // getters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}