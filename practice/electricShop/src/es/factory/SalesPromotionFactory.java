package es.factory;

import es.stragedy.handler.SalesPromotion;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SalesPromotionFactory {

    /** 单例模式控制*/
    private volatile static SalesPromotionFactory salesPromotionFactory;

    private static Map<String, SalesPromotion> salesPormotionMap = new ConcurrentHashMap<>();


    public static SalesPromotionFactory getSalesPromotionFactory(Map<String,SalesPromotion> stragedyMap){
        if(salesPromotionFactory == null){
            synchronized (SalesPromotionFactory.class){
                if(salesPromotionFactory == null){
                    salesPromotionFactory = new SalesPromotionFactory(stragedyMap);
                }
            }
        }
        return salesPromotionFactory;
    }
    private SalesPromotionFactory(Map<String,SalesPromotion> stragedyMap) {
        SalesPromotionFactory.salesPormotionMap.putAll(stragedyMap);
    }

    public void executeSalesPromotion(String name){
        salesPormotionMap.get(name).salesPromotion();
    }
}
