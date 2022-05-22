package org.halim.code.smell.method;

import org.halim.code.smell.model.PriceModel;
import org.halim.code.smell.model.ProductModel;

public class ProductService {

    /**
     * Problem: inside your method, you get multiple values from an object and then pass
     */
    public Double retrieveProductPrice1(ProductModel product) {

        double price = product.getPrice().getValue();
        double taxes = product.getPrice().getTaxes();
        double finalPrice = calculateFinalPrice(price, taxes);
        return finalPrice;
    }

    private double calculateFinalPrice(double price, double taxes) {
        return price * taxes;
    }

    /**
     * Solution: pass the whole object without extra variables
     */
    public Double retrieveProductPrice2(ProductModel product) {
        return calculateFinalPrice(product.getPrice());
    }

    private double calculateFinalPrice(PriceModel priceModel) {
        return priceModel.getValue() * priceModel.getTaxes();
    }


    /**
     * Problem: complex if...else or switch conditions
     */
    public void validateProductAvailability1(ProductModel product) {
        if (product.getTotalAmount() > Integer.MIN_VALUE &&
                (product.getTotalAmount() -
                        (product.getAmountReserved() +
                                product.getAmountInOffer() +
                                product.getAmountInGift())) > Integer.MIN_VALUE) {
            System.out.println("Valid product");
        } else {
            System.out.println("Invalid product");
        }
    }

    /**
     * Solution: decompose the complex condition parts into a separate method
     */
    public void validateProductAvailability2(ProductModel product) {
        if (isAvailableProduct(product)) {
            System.out.println("Valid product");
        } else {
            System.out.println("Invalid product");
        }
    }

    private boolean isAvailableProduct(ProductModel product) {
        return product.getTotalAmount() > Integer.MIN_VALUE &&
                (product.getTotalAmount() -
                        (product.getAmountReserved() +
                                product.getAmountInOffer() +
                                product.getAmountInGift())) > Integer.MIN_VALUE;
    }

}
