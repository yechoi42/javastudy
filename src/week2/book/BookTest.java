package week2.book;

public class BookTest {
    public static void main(String [] args)
    {
        Book littlePrince=new Book("어린 왕자","생택쥐페리");
        Book loveStory=new Book("춘향전");
        Book emptyBook=new Book();
        System.out.println(emptyBook);
        System.out.println(emptyBook.returnThisBook());
        loveStory.show();
    }
}
