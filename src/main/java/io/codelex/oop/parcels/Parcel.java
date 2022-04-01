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

    private boolean isDimensionSumWithinLimit() {
        int DIMENSION_SIZE_SUM = 300;
        return getXLength() + getYLength() + getZLength() <= DIMENSION_SIZE_SUM;
    }

    private boolean isSizeWithinLimit() {
        int DIMENSION_SIZE = 30;
        return getXLength() >= DIMENSION_SIZE && getYLength() >= DIMENSION_SIZE && getZLength() >= DIMENSION_SIZE;
    }

    private boolean isWeightWithinLimit() {
        float WEIGHT_LIMIT = 30.0F;
        float WEIGHT_LIMIT_EXPRESS = 15.0F;
        return (getWeight() >= WEIGHT_LIMIT && !isExpress()) || (getWeight() >= WEIGHT_LIMIT_EXPRESS && isExpress());
    }

    @Override
    public boolean validate() {
        boolean isValid = true;
        if (isDimensionSumWithinLimit()) {
            if (isSizeWithinLimit()) {
                if (isWeightWithinLimit()) {
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
