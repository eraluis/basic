package co.runcode.bo.person;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.runcode.bo.CrudBO;
import co.runcode.dm.person.Person;

@Local 
@Path("person")
public interface PersonLBO extends CrudBO<Person> {
	
	public int calcularEdadPersona(Long idPersona);
	public int calcularEdadPersona(String firstName, String lastName);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> listPersons();
}
