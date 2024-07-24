import java.awt.print.Book;
import java.security.PublicKey;
import java.util.Arrays;

public abstract class Library {
private String name;
private String author;
private int age;
private int code;

    public Library() {
    }

    public Library(String name, String author, int age, int code) {
        this.name = name;
        this.author = author;
        this.age = age;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", age=" + age +
                ", code=" + code +
                '}';
    }

    int count = 0;
    Book [] books = new Book[10];

    public void add(Book book){
        if (count < books.length){
            books[count] = book;
            count++;
        }
    }

    public void listBook(){
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null){
                System.out.println(books[i].toString());
            }
        }
    }


}
