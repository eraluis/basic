package co.runcode.bo.person;

import javax.ejb.Local;

import co.runcode.bo.CrudBO;
import co.runcode.dm.location.City;
import co.runcode.dm.person.Address;
import co.runcode.dm.person.Person;

@Local
public interface AddressLBO extends CrudBO<Address> {

	public Address addAdrressToPerson(Person p, City city, String street1, String street2);
	public Address getActiveAddress(Person p);

}
