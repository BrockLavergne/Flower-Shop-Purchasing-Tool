package com.techelevator;

import java.math.BigDecimal;

public class Delivery {

//    private boolean sameDayDelivery;
//    private String zipcode;

//    public Delivery(boolean sameDayDelivery, String zipcode){
//
//        this.sameDayDelivery = sameDayDelivery;
//        this.zipcode = zipcode;

//    }

    public BigDecimal deliveryTotal(boolean sameDayDelivery, String zipcode){

        sameDayDelivery = false;

        //put values into strings
        BigDecimal sameDayDeliveryFee = new BigDecimal(5.99);
        BigDecimal zip2000 = new BigDecimal(3.99);
        BigDecimal zip3000 = new BigDecimal(6.99);
        BigDecimal allOtherZips = new BigDecimal(19.99);

        if(zipcode.startsWith("2")) {
            if (sameDayDelivery) {
                return sameDayDeliveryFee.add(zip2000);
            }else{
                return zip2000;
            }
        }else if(zipcode.startsWith("3")){
            if (sameDayDelivery){
                return sameDayDeliveryFee.add(zip3000);
            }else{
                return zip3000;
            }
        }else{
            return allOtherZips;
        }
    }
}
