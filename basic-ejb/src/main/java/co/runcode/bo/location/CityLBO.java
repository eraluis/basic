package co.runcode.bo.location;

import javax.ejb.Local;

import co.runcode.bo.CrudBO;
import co.runcode.dm.location.City;

@Local
public interface CityLBO extends CrudBO<City> {

}