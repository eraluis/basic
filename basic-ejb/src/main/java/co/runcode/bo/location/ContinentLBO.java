package co.runcode.bo.location;

import javax.ejb.Local;

import co.runcode.bo.CrudBO;
import co.runcode.dm.location.Continent;

@Local
public interface ContinentLBO extends CrudBO<Continent> {

}
