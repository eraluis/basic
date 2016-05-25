package co.runcode.boimpl.location;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import co.runcode.bo.location.StateLBO;
import co.runcode.boimpl.CrudBOImpl;
import co.runcode.dm.location.Country;
import co.runcode.dm.location.State;

@Stateless
public class StateLBOImpl extends CrudBOImpl<State> implements StateLBO {

    public StateLBOImpl() {
        this(State.class);
    }

    public StateLBOImpl(Class<State> entityClass) {
        super(entityClass);
    }
    
    @Override
    public List<State> findByCountry(Country country){
    	
    	if(country == null) {
    		throw new IllegalArgumentException("Country can not be null");
    	}
    	
    	String jpql = 
    			  " SELECT s FROM State s "
    			+ " WHERE s.country = :country ";
    	
    	TypedQuery<State> query = em.createQuery(jpql, State.class);
    	query.setParameter("country", country);
    	
    	return query.getResultList();
    	    	
    }

}