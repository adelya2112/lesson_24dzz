import java.awt.print.Book;

public class Technical extends Library{
    private String book;

    public Technical(String book, String s, int i, int i1) {
        this.book = book;
    }

    public Technical(String name, String author, int age, int code, String book) {
        super(name, author, age, code);
        this.book = book;
    }

    int count = 0;
    Book[] books = new Book[10];

    public void add(Book book){
        if (count < books.length){
            books[count] = book;
            count++;
        }
    }

}
