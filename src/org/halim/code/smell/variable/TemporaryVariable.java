package org.halim.code.smell.variable;

public class TemporaryVariable {

    /**
     * Problem: placing results of an expression in a local variable for later use
     */
    public Double calculate1(double quantity, double price) {
        double totalPrice = quantity * price;
        if (totalPrice > 999) {
            return totalPrice * 0.81;
        } else {
            return totalPrice * 0.85;
        }
    }

    /**
     * Solution: move the expression to a separate method and query the method instead of
     * using local variables
     */
    public Double calculate2(double quantity, double price) {
        if (calculateTotalPrice(quantity, price) > 999)
            return calculateTotalPrice(quantity, price) * 0.81;
        else
            return calculateTotalPrice(quantity, price) * 0.85;
    }

    private double calculateTotalPrice(double quantity, double price) {
        return quantity * price;
    }

}
