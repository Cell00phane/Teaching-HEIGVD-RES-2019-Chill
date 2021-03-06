package ch.heigvd.res.chill.domain.ecarpita93;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class LaValona implements IProduct {

    public final static String NAME = "LaValona";
    public final static BigDecimal PRICE = new BigDecimal(2.4);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}

