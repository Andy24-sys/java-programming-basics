package org.javaguru.student_andrey_klimenko.lesson_7_array_and_loops.level_3;

class ReceiptCalculatorApp {
    public static void main(String[] args) {

        Receipt[] receipt = {
                new Receipt("n1", 2.0),
                new Receipt("n2", 3.5),
        };
        for (Receipt value : receipt) {
            System.out.println(value);
        }
        ReceiptCalculator receiptCalculator = new ReceiptCalculator();
        System.out.println(receiptCalculator.calculate(receipt));
        System.out.println(receiptCalculator.receiptAverage(receipt));

    }
}