package co.runcode.boimpl.person;

import javax.ejb.Stateless;
import javax.inject.Inject;

import co.runcode.bo.person.AddressLBO;
import co.runcode.bo.person.PersonLBO;
import co.runcode.boimpl.CrudBOImpl;
import co.runcode.dm.commons.Status;
import co.runcode.dm.location.City;
import co.runcode.dm.person.Address;
import co.runcode.dm.person.Person;


@Stateless
public class AddressLBOImpl extends CrudBOImpl<Address> implements AddressLBO {

	@Inject
	private PersonLBO personLBO;
	
    public AddressLBOImpl() {
        this(Address.class);
    }

    public AddressLBOImpl(Class<Address> entityClass) {
        super(entityClass);
    }
    
    @Override
    public Address addAdrressToPerson(Person person, City city, String street1, String street2){
    	
    	if(person != null && person.getId() != null && city != null && city.getId() != null){
    		
    		Address oldAddress = getActiveAddress(person);
    		if( oldAddress != null){
    			oldAddress.setStatus(Status.HISTORIC);
    			this.edit(oldAddress);
    		}
    		
    		Address newAddress = new Address(
    				person, 
    				city.getState().getCountry(), city.getState(), city, 
    				street1, street2, 
    				Status.ACTIVE);

    		this.add(newAddress);
    		
    		return newAddress;
    		
    	}
    	    	
    	return null;
    }
    
    @Override
    public Address getActiveAddress(Person p){
    	
    	//Update reference from persistence layer 
    	p = personLBO.find(p.getId());
    	
    	if(p != null && p.getId() != null ){
    		for( Address a : p.getAddressList() ){
    			if (a.getStatus() == Status.ACTIVE){
    				return a;
    			}
    		}    		
    	}
    	
    	return null;
    }
}