package co.runcode.boimpl.location;

import javax.ejb.Local;

import co.runcode.bo.location.CityLBO;
import co.runcode.boimpl.CrudBOImpl;
import co.runcode.dm.location.City;

@Local
public class CityLBOImpl extends CrudBOImpl<City> implements CityLBO {

    public CityLBOImpl() {
        this(City.class);
    }

    public CityLBOImpl(Class<City> entityClass) {
        super(entityClass);
    }
    
}