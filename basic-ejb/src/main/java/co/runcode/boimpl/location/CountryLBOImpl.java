package co.runcode.boimpl.location;

import javax.ejb.Stateless;

import co.runcode.bo.location.CountryLBO;
import co.runcode.boimpl.CrudBOImpl;
import co.runcode.dm.location.Country;

@Stateless
public class CountryLBOImpl extends CrudBOImpl<Country> implements CountryLBO {

    public CountryLBOImpl() {
        this(Country.class);
    }

    public CountryLBOImpl(Class<Country> entityClass) {
        super(entityClass);
    }

}