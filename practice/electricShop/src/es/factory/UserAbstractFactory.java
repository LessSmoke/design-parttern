package es.factory;

import es.entity.AbstractUser;

public abstract class UserAbstractFactory {

    /**
     * 用于创建用户的接口
     **/
    public abstract AbstractUser createUser(String username);
}
