package ch.heigvd.res.chill.domain.briskocube;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Busch implements IProduct {

    public final static String NAME = "Busch";
    public final static BigDecimal PRICE = new BigDecimal(4.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}