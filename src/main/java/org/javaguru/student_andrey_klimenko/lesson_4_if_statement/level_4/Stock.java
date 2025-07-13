package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_4;

class Stock {
    private final String nameCompany;
    private int CurrentPrice;
    private int maxPrice;
    private int minPrice;


   public Stock(String nameCompany, int currentPrice) {
        this.nameCompany = nameCompany;
        CurrentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public int updatePrice(int newPrice) {
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        }
        if (newPrice < this.minPrice) {
            this.minPrice = newPrice;
        }

        return setCurrentPrice(newPrice);
    }

    public int setCurrentPrice(int currentPrice) {
        CurrentPrice = currentPrice;
        return currentPrice;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public int getCurrentPrice() {
        return CurrentPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }
}
