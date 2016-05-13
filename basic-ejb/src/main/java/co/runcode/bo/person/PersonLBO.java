package co.runcode.bo.person;

import javax.ejb.Local;

import co.runcode.bo.CrudBO;
import co.runcode.dm.person.Person;

@Local
public interface PersonLBO extends CrudBO<Person> {
	
	public int calcularEdadPersona(Long idPersona);
	public int calcularEdadPersona(String firstName, String lastName);

}
