package com.techelevator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DeliveryFeeTest{

    @Test
  public void Delivery1(){

        Delivery delivery = new Delivery();
        BigDecimal expectedTotal = new BigDecimal("19.99").setScale(2, RoundingMode.HALF_UP);
        Assert.assertEquals(expectedTotal, delivery.deliveryTotal(false, "87665").setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    public void Delivery2(){
        Delivery delivery = new Delivery();
        BigDecimal expectedTotal = new BigDecimal("6.99").setScale(2, RoundingMode.HALF_UP);
        Assert.assertEquals(expectedTotal, delivery.deliveryTotal(false, "37665").setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    public void Delivery3(){
    Delivery delivery = new Delivery();
    BigDecimal expectedTotal = new BigDecimal("3.99").setScale(2, RoundingMode.HALF_UP);
        Assert.assertEquals(expectedTotal, delivery.deliveryTotal(false, "27665").setScale(2, RoundingMode.HALF_UP));
    }

}