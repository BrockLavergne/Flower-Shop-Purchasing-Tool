package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FlowerShopOrder {

    private String bouquetStyle;
    private int numberOfRoses;

    private BigDecimal bouquetPrice = new BigDecimal(19.99);

    BigDecimal roseTotal = new BigDecimal(numberOfRoses * 2.99);

    private BigDecimal subtotal = new BigDecimal(String.valueOf(bouquetPrice.add(roseTotal)));

    public FlowerShopOrder(String bouquetStyle, int numberOfRoses){

        this.bouquetStyle = bouquetStyle;
        this.numberOfRoses = numberOfRoses;

    }





    public BigDecimal getSubtotal() {

        BigDecimal roseTotal = new BigDecimal(2.99 * numberOfRoses);

        subtotal = subtotal.add(roseTotal).setScale(2, RoundingMode.HALF_UP);

        return subtotal;

    }




    @Override
    public String toString() {
        return "ORDER - " + "Bouquet style: " +
                bouquetStyle +
                " | " + numberOfRoses +
                " roses | " + "Total: " + getSubtotal();
    }




    public String getBouquetStyle() {
        return bouquetStyle;
    }

    public int getNumberOfRoses() {
        return numberOfRoses;
    }

    public void setBouquetStyle(String bouquetStyle) {
        this.bouquetStyle = bouquetStyle;
    }

    public void setNumberOfRoses(int numberOfRoses) {
        this.numberOfRoses = numberOfRoses;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
}
