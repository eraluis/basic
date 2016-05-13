package co.runcode.bo.location;

import javax.ejb.Local;

import co.runcode.bo.CrudBO;
import co.runcode.dm.location.Country;

@Local
public interface CountryLBO extends CrudBO<Country> {

}