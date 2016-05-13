package co.runcode.bo.location;

import javax.ejb.Local;

import co.runcode.bo.CrudBO;
import co.runcode.dm.location.State;

@Local
public interface StateLBO extends CrudBO<State> {

}