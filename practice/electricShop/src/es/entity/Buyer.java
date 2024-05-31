package es.entity;

import java.util.UUID;

public class Buyer extends AbstractUser {
    private String uuid;

    private String username;

    public Buyer(String username) {
        this.uuid = UUID.randomUUID().toString().replaceAll("-","");
        this.username = username;
    }

    @Override
    public void action(){
        System.out.println("买东西....");
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
