package org.halim.code.smell.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class PriceModel {

    private double value;
    private double primaryPrice;
    private double secondaryPrice;
    private double specialPrice;
    private double taxes;


}
