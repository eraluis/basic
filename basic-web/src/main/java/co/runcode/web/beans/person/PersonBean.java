package co.runcode.web.beans.person;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.primefaces.event.RowEditEvent;

import co.runcode.bo.location.CityLBO;
import co.runcode.bo.person.AddressLBO;
import co.runcode.bo.person.PersonLBO;
import co.runcode.dm.location.City;
import co.runcode.dm.person.Address;
import co.runcode.dm.person.Person;
import co.runcode.web.beans.location.LocationBean;

@ManagedBean
@ViewScoped
public class PersonBean {
	
	private List<Person> personList;
	private Person selectedPerson;
	private Person newPerson;
		
	private boolean addressPanel;
	private Address actualAddress;
	private Address newAddress;	
	
	@ManagedProperty(value="#{locationBean}")
	private LocationBean locationBean;
		
	@Inject 
	private PersonLBO personLBO;	
	@Inject 
	private AddressLBO addressLBO;
	@Inject 
	private CityLBO cityLBO;
	
	public PersonBean(){
		
	}

	@PostConstruct
	public void init(){
		personList = personLBO.findAll();
		selectedPerson = new Person();
		newPerson = new Person();
		addressPanel = false;
		actualAddress = new Address();
		newAddress = new Address();
		
	}
	
	//button actions
	public String addPerson(){
		personLBO.add(newPerson);
		personList.add(newPerson);
		newPerson = new Person();
		return null;
	}
	
	public String manageAddress(Person p){		
		System.out.println("First name: " +p.getFirstName());
		selectedPerson = p;
		actualAddress = addressLBO.getActiveAddress(p);
		addressPanel = true;
		return null;	
	}
	
	public String cancelManageAddress(){				
		selectedPerson = new Person();
		actualAddress = new Address();
		newAddress = new Address();
		addressPanel = false;
		return null;	
	}
	
	public String addAddressToPerson(){				
		//Update city reference
		City city = cityLBO.find( locationBean.getCity().getId() );
		
		newAddress = addressLBO.addAdrressToPerson(
				selectedPerson, city, newAddress.getStreet1(), newAddress.getStreet2());
		
		if(newAddress != null){
			FacesContext.getCurrentInstance().addMessage("growl", 
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Information",  "Address updated") );
		}else{
			FacesContext.getCurrentInstance().addMessage("growl", 
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",  "Error while update address") );
		}
		
		locationBean.init();
		newAddress = new Address();		
		addressPanel = false;
		
		return null;
	}
	
	//Test - Look for a person
	public List<Person> completePerson(String query){
		System.out.println("completePerson: "+ query);
		
		List<Person> filterPerson = new ArrayList<>();
		
		for(Person p: personList){
			if(p.getFirstName().toLowerCase().startsWith(query)) {
				filterPerson.add(p);
            }
		}
		return filterPerson;
	
	}
	
	//Editable dataTable methods
	public void onRowEdit(RowEditEvent event) {
		Person edited = (Person) event.getObject();
		personLBO.edit(edited);
		
        FacesMessage msg = new FacesMessage("Person Edited", edited.getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((Person) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    //getters and setters
	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	public Person getSelectedPerson() {
		return selectedPerson;
	}

	public void setSelectedPerson(Person selectedPerson) {
		this.selectedPerson = selectedPerson;
	}

	public Person getNewPerson() {
		return newPerson;
	}

	public void setNewPerson(Person newPerson) {
		this.newPerson = newPerson;
	}

	public boolean isAddressPanel() {
		return addressPanel;
	}

	public void setAddressPanel(boolean addressPanel) {
		this.addressPanel = addressPanel;
	}

	public Address getActualAddress() {
		return actualAddress;
	}

	public void setActualAddress(Address actualAddress) {
		this.actualAddress = actualAddress;
	}

	public Address getNewAddress() {
		return newAddress;
	}

	public void setNewAddress(Address newAddress) {
		this.newAddress = newAddress;
	}

	public LocationBean getLocationBean() {
		return locationBean;
	}

	public void setLocationBean(LocationBean locationBean) {
		this.locationBean = locationBean;
	}	
}
