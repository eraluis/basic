package co.runcode.bo.location;

import java.util.List;

import javax.ejb.Local;

import co.runcode.bo.CrudBO;
import co.runcode.dm.location.City;
import co.runcode.dm.location.State;

@Local
public interface CityLBO extends CrudBO<City> {
	
	public List<City> findByState(State state);

}