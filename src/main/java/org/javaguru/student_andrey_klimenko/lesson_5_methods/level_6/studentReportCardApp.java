package org.javaguru.student_andrey_klimenko.lesson_5_methods.level_6;

public class studentReportCardApp {
    public static void main(String[] args) {
        StudentReportCard studentReportCard=new StudentReportCard();

        System.out.println(studentReportCard.averageScore("Математика",4,"Физика",5,
                "Химия",3));
        System.out.println(studentReportCard.averageScore("Математика",3,"Физика",2,
                "Химия",5));

    }
}
