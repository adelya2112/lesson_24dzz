import java.awt.print.Book;

public class Artistic extends Library{
    private String book;

    public Artistic(String name, String author, int age, int code) {
        super(name, author, age, code);
        this.book = book;
    }

    @Override
    public String toString() {
        return "Artistic{" +
                "book='" + book + '\'' +
                '}';
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
