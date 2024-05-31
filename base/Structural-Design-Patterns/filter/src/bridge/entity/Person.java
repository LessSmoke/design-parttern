package bridge.entity;

/**
 *@description: 标准类
 *@author:     yujunxin
 *@createTime: 2024/5/31 14:22
 *@version:    1.0
 */
public class Person {

    /** 姓名 */
    private String name;

    /** 性别 */
    private String gender;

    /** 结婚 */
    private String maritalStatus;


    public Person() {
    }

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}';
    }
}
