package org.javaguru.student_andrey_klimenko.lesson_5_methods.level_3;

class TaxApp {
    public static void main(String[] args) {
        TaxVuer tax=new TaxVuer();

        System.out.println(tax.resultNalog(100));
        System.out.println(tax.resultNalog(20000));
        System.out.println(tax.resultNalog(55000));
    }
}
