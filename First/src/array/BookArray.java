package array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library1 = new Book[5];
        Book[] library2 = new Book[5];
        Book[] library3 = new Book[5];

        library1[0] = new Book("태백산맥", "조정래");
        library1[1] = new Book("데미안", "헤르만 헤세");
        library1[2] = new Book("어떻게 살 것인가", "유시민");
        library1[3] = new Book("토지", "박경리");
        library1[4] = new Book("어린왕자", "생택쥐페리");

        System.out.println("==========1");
        for (Book book : library1) {
            book.showBookInfo();
        }

        System.arraycopy(library1, 0, library2, 0, 5); // 얕은 복사 -> 주소

        library3[0] = new Book();
        library3[1] = new Book();
        library3[2] = new Book();
        library3[3] = new Book();
        library3[4] = new Book();

        for(int i = 0; i < library3.length; i++) { // 깊은 복사 -> 값
            library3[i].setAuthor(library1[i].getAuthor());
            library3[i].setBookName(library1[i].getBookName());
        }

        System.out.println("==========2");
        for (Book book : library2) {
            book.showBookInfo();
        }
        
        library1[0].setBookName("인생의 발견");
        library1[0].setAuthor("시어도어 젤딘");

        System.out.println("==========2");
        for(Book book : library2) {
            book.showBookInfo();
        }

        System.out.println("==========3");
        for(Book book : library3) {
            book.showBookInfo();
        }
    }
}
