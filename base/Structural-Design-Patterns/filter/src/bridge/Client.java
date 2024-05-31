package bridge;

import bridge.criteria.Filter;
import bridge.entity.Person;
import bridge.implementor.FilterAnd;
import bridge.implementor.FilterFemale;
import bridge.implementor.FiltermaritalStatus;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("风清扬","男","已婚"));
        personList.add(new Person("梅超风","女","未婚"));
        personList.add(new Person("张无忌","男","已婚"));
        personList.add(new Person("小龙女","女","未婚"));

        Filter filter = new FilterAnd(new FilterFemale(), new FiltermaritalStatus());
        System.out.println(filter.filterPerson(personList));
    }
}
