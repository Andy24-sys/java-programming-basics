package org.javaguru.student_andrey_klimenko.lesson_3_oop_first_look.level_3;

public class BookApp {
    public static void main(String[] args) {
        Chapter chapter1=new Chapter("гл1","йцу");
        Chapter chapter2=new Chapter("гл2","зщш");
        Book book1=new Book("Привет мир!","Пупкин",1999,chapter1,chapter2);
        Book book2=new Book("Му-му","Тургенев",1899,chapter1,
                new Chapter("Глава 1", "Собака"));

        System.out.println(book1);
        System.out.println(book1.getAuthor());
        System.out.println(book1.getChapter1().getText());
        System.out.println(book1.getChapter1().getName());
        System.out.println(book1.getChapter2().getName());
        System.out.println("Название - "+book2.getTitle()+", Автор - "+book2.getAuthor());
        System.out.println(book2.getChapter2().getName()+", название - "+book2.getChapter2().getText());


        System.out.println(chapter1.getName());
        System.out.println(chapter2.getText());

    }
}
