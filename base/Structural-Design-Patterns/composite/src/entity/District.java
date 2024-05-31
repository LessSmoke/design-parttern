package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *@description: 行政区划类
 *@author:     yujunxin
 *@createTime: 14:51
 *@version:    1.0
 */
public class District {
    private String name;

    private String code;

    private String attribute;

    private List<District> childrenDistrict;

    public District() {
    }

    public District(String name, String code, String attribute) {
        this.name = name;
        this.code = code;
        this.attribute = attribute;
        this.childrenDistrict = new ArrayList<>();
    }

    public void addChildren(District district){
        this.childrenDistrict.add(district);
    }

    public void remove(District district){
        this.childrenDistrict.remove(district);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public List<District> getChildrenDistrict() {
        return childrenDistrict;
    }

    public void setChildrenDistrict(List<District> childrenDistrict) {
        this.childrenDistrict = childrenDistrict;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", attribute='" + attribute + '\'' +
                ", childrenDistrict=" + childrenDistrict +
                '}';
    }
}
