package org.javaguru.student_andrey_klimenko.lesson_3_oop_first_look.level_7;

class BankAccount {
    private String owner;
    private int money;

    public BankAccount(String owner,int money) {
        this.owner = owner;
        this.money=money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String owner = bankAccount.getOwner();
        int money = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }

}
