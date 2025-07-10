package org.javaguru.student_andrey_klimenko.lesson_3_oop_first_look.lessoncode;

class BankAccountApp {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();

        bankAccount.setOwner("Rem");
        bankAccount.setMoney(100);

        System.out.println(bankAccount.getOwner()+" -"+bankAccount.getMoney());

    }

}
