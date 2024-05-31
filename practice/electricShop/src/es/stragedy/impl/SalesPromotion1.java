package es.stragedy.impl;

import es.stragedy.handler.AbstractSalesPromotion;

public class SalesPromotion1 extends AbstractSalesPromotion {

    public SalesPromotion1() {
        super();
    }

    @Override
    public void salesPromotion() {
        super.salesPromotion();
        System.out.println("促销活动1");
    }
}
