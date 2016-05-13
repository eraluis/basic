package co.runcode.web.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.primefaces.event.RowEditEvent;

import co.runcode.bo.person.PersonLBO;
import co.runcode.dm.person.Person;

@ManagedBean
@ViewScoped
public class PersonBean {
	
	private List<Person> personList;
	
	@Inject
	PersonLBO personLBO;
	
	public PersonBean(){
		
	}

	@PostConstruct
	public void init(){
		personList = personLBO.findAll();
		
	}
	
	public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Person Edited", ((Person) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((Person) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}	
}
