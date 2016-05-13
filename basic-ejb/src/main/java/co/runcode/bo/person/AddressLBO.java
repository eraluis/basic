package co.runcode.bo.person;

import javax.ejb.Local;

import co.runcode.bo.CrudBO;
import co.runcode.dm.person.Address;

@Local
public interface AddressLBO extends CrudBO<Address> {

}
