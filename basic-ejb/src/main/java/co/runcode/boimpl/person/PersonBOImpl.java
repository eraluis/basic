package co.runcode.boimpl.person;

import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.runcode.bo.person.PersonLBO;
import co.runcode.boimpl.CrudBOImpl;
import co.runcode.dm.person.Person;

@Local
public class PersonBOImpl extends CrudBOImpl<Person> implements PersonLBO {
	
    @PersistenceContext(unitName = "dataModelPU")
    private EntityManager em;
    
    public PersonBOImpl() {
        this(Person.class);
    }

    public PersonBOImpl(Class<Person> entityClass) {
        super(entityClass);
    }

	@Override
	public int calcularEdadPersona(Long idPersona) {
//		Person person = this.find(idPersona);
		///
		return 0;
	}

	@Override
	public int calcularEdadPersona(String firstName, String lastName) {

		return 0;
	}
}
