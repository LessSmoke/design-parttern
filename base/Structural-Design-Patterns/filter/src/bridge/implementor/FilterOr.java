package bridge.implementor;

import bridge.criteria.Filter;
import bridge.entity.Person;

import java.util.List;
 
public class FilterOr implements Filter {
 
   private Filter filter;
   private Filter otherfilter;
 
   public FilterOr(Filter filter, Filter otherfilter) {
      this.filter = filter;
      this.otherfilter = otherfilter;
   }
 
   @Override
   public List<Person> filterPerson(List<Person> personList) {
      List<Person> firstCriteriaItems = filter.filterPerson(personList);
      List<Person> otherCriteriaItems = otherfilter.filterPerson(personList);
 
      for (Person person : otherCriteriaItems) {
         if(!firstCriteriaItems.contains(person)){
           firstCriteriaItems.add(person);
         }
      }  
      return firstCriteriaItems;
   }
}