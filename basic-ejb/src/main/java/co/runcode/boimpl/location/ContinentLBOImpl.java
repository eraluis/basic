package co.runcode.boimpl.location;

import javax.ejb.Stateless;

import co.runcode.bo.location.ContinentLBO;
import co.runcode.boimpl.CrudBOImpl;
import co.runcode.dm.location.Continent;

@Stateless
public class ContinentLBOImpl extends CrudBOImpl<Continent> implements ContinentLBO {

    public ContinentLBOImpl() {
        this(Continent.class);
    }

    public ContinentLBOImpl(Class<Continent> entityClass) {
        super(entityClass);
    }
    
}