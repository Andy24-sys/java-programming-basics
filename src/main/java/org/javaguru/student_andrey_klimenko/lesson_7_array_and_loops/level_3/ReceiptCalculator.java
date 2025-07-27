package org.javaguru.student_andrey_klimenko.lesson_7_array_and_loops.level_3;

class ReceiptCalculator {

    public double calculate(Receipt[] receipts) {
        double resultSum = 0.0;
        for (Receipt receipt : receipts) {
            resultSum += receipt.getSum();
        }
        return resultSum;
    }

    public double receiptAverage(Receipt[] receipts) {
        if (receipts.length == 0) {
            return 0.0;
        } else {
            double resultSum = calculate(receipts);
            return resultSum / receipts.length;
        }
    }

}
