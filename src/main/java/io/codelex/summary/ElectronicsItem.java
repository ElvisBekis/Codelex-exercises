package io.codelex.summary;

import java.math.BigDecimal;

public class ElectronicsItem extends AbstractItem {

    private int power;

    public ElectronicsItem(String name, BigDecimal price, int power) {
        super(name, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
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
        return getName() + ", " + getPrice() + "EUR, power: " + getPower();
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
