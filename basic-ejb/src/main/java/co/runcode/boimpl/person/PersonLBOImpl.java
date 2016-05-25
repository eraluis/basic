package co.runcode.boimpl.person;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.runcode.bo.person.PersonLBO;
import co.runcode.boimpl.CrudBOImpl;
import co.runcode.dm.person.Person;


@Stateless
public class PersonLBOImpl extends CrudBOImpl<Person> implements PersonLBO {
	
    @PersistenceContext(unitName = "dataModelPU")
    private EntityManager em;
    
    public PersonLBOImpl() {
        this(Person.class);
    }

    public PersonLBOImpl(Class<Person> entityClass) {
        super(entityClass);
    }

	@Override
	public int calcularEdadPersona(Long idPersona) {
		return 0;
	}

	@Override
	public int calcularEdadPersona(String firstName, String lastName) {
		return 0;
	}

	@Override
	public List<Person> listPersons() {		
		return this.findAll();
	}
}
