package tr.com.prime.kadirkebabci;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="personListView")
@ViewScoped
public class PersonListView {
	
	private List<Person> persList;
	
	
  public PersonListView() {
	  persList = new ArrayList<Person>();
	  
	  
	  Person person = new Person();
	  person.setName("kadir");
	  person.setSurname("kebabci");
	  persList.add(person);
	  
	  
  }


public List<Person> getPersList() {
	return persList;
}


public void setPersList(List<Person> persList) {
	this.persList = persList;
}
  
  
  
	
	

}
