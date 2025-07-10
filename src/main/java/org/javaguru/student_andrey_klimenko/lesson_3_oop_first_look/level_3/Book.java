package org.javaguru.student_andrey_klimenko.lesson_3_oop_first_look.level_3;
/*
Создайте классы описывающие книгу.
Книга описывается следующими свойствами:
        - название;
- автор;
- год выпуска;
- глава 1;
- глава 2;

Глава книги - это объект у которого есть:
- название;
- текст главы;

У каждого класса должен быть конструктор,
для задания начального значения всем свойствам класса.
 */

class Book {
    private String title;
    private String author;
    private int year;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String title, String author, int year, Chapter chapter1, Chapter chapter2) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", chapter1='" + chapter1 + '\'' +
                ", chapter2='" + chapter2 + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public Chapter getChapter1() {
        return chapter1;
    }

    public Chapter getChapter2() {
        return chapter2;
    }
}
