package week3.objectCopy;

/*
얕은 복사: operator=, System.arrayCopy()
깊은 복사: clone()(2차원일 때는 얕은 복사 됨), for 문 돌면서 값 복사,
 */

public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("오리 간식 맛있어", "마리");

//        shallow copy
//        System.arraycopy(bookArray1, 0 , bookArray2, 0, 3);

//        deep copy
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i] = new Book(bookArray1[i]);
        }

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].show();
        }

        bookArray1[0].setTitle("나목");
        bookArray1[0].setAuthor("박완서");

        System.out.println("=======bookArray1");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].show();
        }
        System.out.println("=======bookArray2");
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].show();
        }
    }
}
