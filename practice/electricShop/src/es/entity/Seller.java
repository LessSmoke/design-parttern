package es.entity;

import java.util.UUID;

/**
 *@description: 用户实体类
 *@author:     yujunxin
 *@createTime: 2024/5/31 15:22
 *@version:    1.0
 */
public class Seller extends AbstractUser{

    private String uuid;

    private String username;

    public Seller(String username) {
        this.uuid = UUID.randomUUID().toString().replaceAll("-","");
        this.username = username;
    }

    @Override
    public void action() {
        System.out.println("卖东西...");
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "uuid='" + uuid + '\'' +
                ", username='" + username + '\'' +
                '}';
    }


}
