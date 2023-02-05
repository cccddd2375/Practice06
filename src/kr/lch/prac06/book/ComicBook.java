package kr.lch.prac06.book;

public class ComicBook extends Book {

    public ComicBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void printType() {
        System.out.println("만화책입니다.");
    }

}
