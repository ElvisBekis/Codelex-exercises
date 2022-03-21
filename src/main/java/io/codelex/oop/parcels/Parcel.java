package io.codelex.oop.parcels;

public class Parcel implements Validatable {


    private final int xLength;
    private final int yLength;
    private final int zLength;
    private final float weight;
    private final boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getXLength() {
        return xLength;
    }

    public int getYLength() {
        return yLength;
    }

    public int getZLength() {
        return zLength;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    @Override
    public boolean validate() {
        boolean isValid = true;
        if (getXLength() + getYLength() + getZLength() <= 300) {
            if (getXLength() >= 30 && getYLength() >= 30 && getZLength() >= 30) {
                if ((getWeight() >= 30.0 && !isExpress()) || (getWeight() >= 15 && isExpress())) {
                    System.out.println("Package is valid!");
                } else {
                    isValid = false;
                    System.out.println("Package is not valid!");
                    System.out.println("Weight exceeds limit!");
                }
            } else {
                isValid = false;
                System.out.println("Package is not valid!");
                System.out.println("Size is below 30!");
            }
        } else {
            isValid = false;
            System.out.println("Package is not valid!");
            System.out.println("Sum of dimensions exceeds 300!");
        }
        return isValid;
    }


}
