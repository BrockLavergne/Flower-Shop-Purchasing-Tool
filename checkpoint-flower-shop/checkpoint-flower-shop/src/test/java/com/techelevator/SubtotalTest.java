package com.techelevator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SubtotalTest{



    @Test
    public void totalAmount(){

        FlowerShopOrder flowerOrder = new FlowerShopOrder("Basic", 0);
        BigDecimal expectedTotal = new BigDecimal(19.99).setScale(2, RoundingMode.HALF_UP);
        Assert.assertEquals(expectedTotal, flowerOrder.getSubtotal());
    }


    @Test
    public void totalAmount2(){

        FlowerShopOrder flowerOrder2 = new FlowerShopOrder("Elegant", 12);
        BigDecimal expectedTotal = new BigDecimal(55.87).setScale(2, RoundingMode.HALF_UP);
        Assert.assertEquals(expectedTotal, flowerOrder2.getSubtotal());

    }
}