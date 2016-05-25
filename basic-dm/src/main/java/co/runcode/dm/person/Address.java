package co.runcode.dm.person;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import co.runcode.dm.commons.Status;
import co.runcode.dm.commons.StatusConverter;
import co.runcode.dm.location.City;
import co.runcode.dm.location.Country;
import co.runcode.dm.location.State;

@Entity
public class Address {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_person", nullable = false)
    private Person person;
    
	private String street1;
	private String street2;
	
	@Convert(converter = StatusConverter.class)
	private Status status;
	
	@ManyToOne(optional = false)
    @JoinColumn(name = "fk_country", nullable = false)
	private Country country;
	@ManyToOne(optional = false)
    @JoinColumn(name = "fk_state", nullable = false)
	private State state;
	@ManyToOne(optional = false)
    @JoinColumn(name = "fk_city", nullable = false)
	private City city;
	
	public Address(){
		
	}
	
	public Address(Person person, Country country, State state, City city, String street1, String street2, Status status){
		this.person = person;
		this.country = country;
		this.state = state;
		this.city = city;
		this.street1 = street1;
		this.street2 = street2;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
}
