package co.runcode.dm.location;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class State {

	@Id
	private Long id;
	private String code;
	private String name;
	
	@ManyToOne(optional = false)
    @JoinColumn(name = "fk_country", nullable = false)
	private Country country;
	
	@OneToMany(mappedBy = "state", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@OrderBy("name ASC")
	private Set<City> cities;

	public State() {
		
	}

	public State(Long id, String code, String name) {
		this.id = id;
		this.code = code;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Set<City> getCities() {
		return cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

}
