package es.factory;

/** 用户抽象工厂*/
public class UserFactoryProducer{

    public static UserAbstractFactory getFactory(String type) throws Exception {
        switch (type){
            case "buyer":
                return new BuyerFactory();
            case "seller":
                return new SellerFactory();
            default:
                throw new Exception("Factory type dont exists. ");
        }
    }
}
