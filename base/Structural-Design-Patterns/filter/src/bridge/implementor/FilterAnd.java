package bridge.implementor;

import bridge.criteria.Filter;
import bridge.entity.Person;

import java.util.List;

public class FilterAnd implements Filter {
    private Filter filter;
    private Filter otherfilter;

    public FilterAnd(Filter filter, Filter otherfilter) {
        this.filter = filter;
        this.otherfilter = otherfilter;
    }

    @Override
    public List<Person> filterPerson(List<Person> personList) {
        List<Person> firstCriteriaItems = filter.filterPerson(personList);

        return otherfilter.filterPerson(firstCriteriaItems);
    }
}
