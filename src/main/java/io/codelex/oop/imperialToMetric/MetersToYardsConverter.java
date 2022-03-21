package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class MetersToYardsConverter extends UnitConverter {


    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal("1.0936133");
    }

}
