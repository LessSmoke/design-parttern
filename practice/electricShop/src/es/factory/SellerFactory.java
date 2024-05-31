package es.factory;

import es.entity.AbstractUser;
import es.entity.Seller;

public class SellerFactory extends UserAbstractFactory{

    @Override
    public AbstractUser createUser(String username) {
        return new Seller(username);
    }

}
