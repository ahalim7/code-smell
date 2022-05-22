package org.halim.code.smell.method;

public class OrderService {

    /**
     * Problem: having a long method that we cannot apply method extraction principals
     */
    public double price1() {

        double primaryPrice;
        double secondaryPrice;
        double specialPrice;
        double taxes;

        //perform complex and long business computation

        return Double.NaN;
    }

    /**
     * Solution: Transform the method into a separated class and the local variables
     * becomes a class fields, then you can split the long method into several methods
     * within the same class
     */
    public double price2() {
        return new PriceCalculator(this).compute();
    }
 }

 class PriceCalculator {

    private double primaryPrice;
    private double secondaryPrice;
    private double specialPrice;
    private double taxes;

    public PriceCalculator(OrderService orderService) {
        // Copy relevant information from the orderService if needed.
    }

    public double compute() {
        //perform complex and long business computation
        return Double.NaN;
    }

 }

