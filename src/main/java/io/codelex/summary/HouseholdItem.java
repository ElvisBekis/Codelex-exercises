package io.codelex.summary;

import java.math.BigDecimal;

public class HouseholdItem extends AbstractItem {

    private String color;

    public HouseholdItem(String name, BigDecimal price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return getName() + ", " + getPrice() + " EUR, color: " + getColor();
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
