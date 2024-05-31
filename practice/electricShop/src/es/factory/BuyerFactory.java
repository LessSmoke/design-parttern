package es.factory;

import es.entity.AbstractUser;
import es.entity.Buyer;

public class BuyerFactory extends UserAbstractFactory{
    @Override
    public AbstractUser createUser(String username) {
        return new Buyer(username);
    }
}
