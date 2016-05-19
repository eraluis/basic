package co.runcode.boimpl.idm;

import co.runcode.bo.idm.PermissionLBO;
import co.runcode.boimpl.CrudBOImpl;
import co.runcode.dm.idm.Permission;

public class PermissionLBOImpl extends CrudBOImpl<Permission> implements PermissionLBO {

    public PermissionLBOImpl() {
        this(Permission.class);
    }

    public PermissionLBOImpl(Class<Permission> entityClass) {
        super(entityClass);
    }
    
}