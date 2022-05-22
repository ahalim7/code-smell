package org.halim.code.smell.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ProductModel {

    private String id;
    private int amountReserved;
    private int amountInOffer;
    private int amountInGift;
    private int totalAmount;
    private PriceModel price;
}
