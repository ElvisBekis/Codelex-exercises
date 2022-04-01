package io.codelex.summary;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FoodItem extends AbstractItem {

    LocalDate bestBefore;

    public FoodItem(String name, BigDecimal price, LocalDate bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }


    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }

    @Override
    public String returnName() {
        return getName();
    }

    @Override
    public BigDecimal returnPrice() {
        return getPrice();
    }

    @Override
    public String fullInfo() {
        return getName() + ", " + getPrice() + " EUR, best before: " + getBestBefore();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice();
    }
}
