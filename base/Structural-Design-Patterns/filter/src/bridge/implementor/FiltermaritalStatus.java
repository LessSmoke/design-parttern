package bridge.implementor;

import bridge.criteria.Filter;
import bridge.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class FiltermaritalStatus implements Filter {
    @Override
    public List<Person> filterPerson(List<Person> personList) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : personList) {
            if("未婚".equalsIgnoreCase(person.getMaritalStatus())){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
