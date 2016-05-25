package co.runcode.bo.location;

import java.util.List;

import javax.ejb.Local;

import co.runcode.bo.CrudBO;
import co.runcode.dm.location.Country;
import co.runcode.dm.location.State;

@Local
public interface StateLBO extends CrudBO<State> {

	public List<State> findByCountry(Country country);

}