package co.runcode.boimpl.location;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import co.runcode.bo.location.CityLBO;
import co.runcode.boimpl.CrudBOImpl;
import co.runcode.dm.location.City;
import co.runcode.dm.location.State;

@Stateless
public class CityLBOImpl extends CrudBOImpl<City> implements CityLBO {

    public CityLBOImpl() {
        this(City.class);
    }

    public CityLBOImpl(Class<City> entityClass) {
        super(entityClass);
    }

	@Override
	public List<City> findByState(State state) {
    	
    	if(state == null) {
    		throw new IllegalArgumentException("State can not be null");
    	}
    	
    	String jpql = 
    			  " SELECT c FROM City c "
    			+ " WHERE c.state = :state ";
    	
    	TypedQuery<City> query = em.createQuery(jpql, City.class);
    	query.setParameter("state", state);
    	
    	return query.getResultList();
    	    	
    }
    
}