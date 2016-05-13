package co.runcode.boimpl.location;

import javax.ejb.Local;

import co.runcode.bo.location.StateLBO;
import co.runcode.boimpl.CrudBOImpl;
import co.runcode.dm.location.State;

@Local
public class StateLBOImpl extends CrudBOImpl<State> implements StateLBO {

    public StateLBOImpl() {
        this(State.class);
    }

    public StateLBOImpl(Class<State> entityClass) {
        super(entityClass);
    }

}