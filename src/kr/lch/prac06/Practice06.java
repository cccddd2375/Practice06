package kr.lch.prac06;

import kr.lch.prac06.book.Book;
import kr.lch.prac06.book.ComicBook;
import kr.lch.prac06.book.Novel;

public class Practice06 {

    public static void main(String[] args) {
        Book book = new ComicBook("만화책1", "홍길동");
        Book book2 = new Novel("소설책", "abc");

        book.printType();
        book2.printType();
    }

    // abstract - abstract class 혹은 interface 에만 선언가능
    // [접근제어자] (abstract) (static) 리턴타입 이름(매개변수) { 코드; }

}
