package bridge.criteria;

import bridge.entity.Person;

import java.util.List;

/** 过滤器接口 */
public interface Filter {

    /** 过滤器抽象方法 */
    List<Person> filterPerson(List<Person> personList);
}
