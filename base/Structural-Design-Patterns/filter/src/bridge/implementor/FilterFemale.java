package bridge.implementor;

import bridge.criteria.Filter;
import bridge.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *@description: 男性过滤器
 *@author:     yujunxin
 *@createTime: 2024/5/31 14:26
 *@version:    1.0
 */
public class FilterFemale implements Filter {
    @Override
    public List<Person> filterPerson(List<Person> personList) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : personList) {
            if("女".equalsIgnoreCase(person.getGender())){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
