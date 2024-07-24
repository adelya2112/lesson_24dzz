import java.awt.print.Book;

public class Legal extends Library{
    private String book;



    public Legal(String name, String author, int age, int code) {
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
