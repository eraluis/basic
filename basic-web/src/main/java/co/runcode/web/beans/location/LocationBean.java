package co.runcode.web.beans.location;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import co.runcode.dm.location.City;
import co.runcode.dm.location.Country;
import co.runcode.dm.location.State;
import co.runcode.bo.location.CityLBO;
import co.runcode.bo.location.CountryLBO;
import co.runcode.bo.location.StateLBO;

@ManagedBean
@ViewScoped
public class LocationBean {
	
	@Inject 
	private CountryLBO countryLBO;
	@Inject 
	private StateLBO stateLBO;
	@Inject 
	private CityLBO cityLBO;
	
	private List<Country> countries;
	private List<State> states;
	private List<City> cities;
	
	private Country country;
	private State state;
	private City city;
	
	public LocationBean(){		
		
	}
	
	@PostConstruct
	public void init(){
		this.countries = countryLBO.findAll();
		this.states = new ArrayList<>();
		this.cities = new ArrayList<>();
		
		this.country = new Country();
		this.state = new State();
		this.city = new City();
	
	}	
	
	public void countryChangend(){		
		country = countryLBO.find( country.getId() );
		this.states = stateLBO.findByCountry(country);
		this.cities = new ArrayList<>();
		
	}
	
	public void stateChangend(){		
		state = stateLBO.find( state.getId() );
		this.cities = cityLBO.findByState(state);
		
	}


	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
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
