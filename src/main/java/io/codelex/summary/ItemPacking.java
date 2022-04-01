package io.codelex.summary;

import java.math.BigDecimal;

public class ItemPacking implements Service {

    private final static String name = "Item packing";
    private final static BigDecimal packingPrice = BigDecimal.valueOf(5);


    @Override
    public String returnName() {
        return name;
    }

    @Override
    public BigDecimal returnPrice() {
        return packingPrice;
    }

    @Override
    public String fullInfo() {
        return returnName() + ", " + returnPrice() + "EUR";
    }
}
