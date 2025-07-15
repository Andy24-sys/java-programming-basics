package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_6;

public class SeosonYearApp {
    public static void main(String[] args) {
        SeasonYear seasonYear=new SeasonYear(22);
        SeasonYear seasonYear1=new SeasonYear(1);
        SeasonYear seasonYear2=new SeasonYear(3);
        SeasonYear seasonYear3=new SeasonYear(6);

        System.out.println(seasonYear.timeYear(seasonYear.getNumMonth()));
        System.out.println(seasonYear1.timeYear(seasonYear1.getNumMonth()));
        System.out.println(seasonYear2.timeYear(seasonYear2.getNumMonth()));
        System.out.println(seasonYear3.timeYear(seasonYear3.getNumMonth()));
    }
}
