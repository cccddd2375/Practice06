package kr.lch.prac06.book;

// 추상 클래스
//  추상적인 클래스 -> 단독 생성이 불가능
//                -> 상속을 받아 구현한 class 를 통한 생성이 가능
public abstract class Book {

    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author; // hi
        // hello
    }

    // abstract method 를 만들 수 있다.
    // public void printType() { System.out.println("만화책입니다." or "소설책입니다."); }

    public abstract void printType();


}
