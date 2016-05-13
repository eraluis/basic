package co.runcode.boimpl.person;

import javax.ejb.Local;

import co.runcode.bo.person.AddressLBO;
import co.runcode.boimpl.CrudBOImpl;
import co.runcode.dm.person.Address;

@Local
public class AddressBOImpl extends CrudBOImpl<Address> implements AddressLBO {

    public AddressBOImpl() {
        this(Address.class);
    }

    public AddressBOImpl(Class<Address> entityClass) {
        super(entityClass);
    }
}