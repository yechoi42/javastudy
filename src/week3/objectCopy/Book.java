package week3.objectCopy;

public class Book{
    String title;
    String author;

    void show(){System.out.println(title+" "+author);}
    public Book(){
        this("","");
        System.out.println("생성자 호출됨");
    }

    public Book(Book book) {
        this(book.title, book.author);
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /*
    Java doesn't supports operator overloading
    because it's just a choice made by its creators who wanted to keep the language more simple.
     */

    public Book(String title)
    {
        this(title,"작자미상");
    }
    public Book(String title, String author)
    {
        this.title=title;
        this.author=author;
    }
}
