package co.runcode.dm.idm;


import javax.persistence.Entity;
import org.picketlink.idm.jpa.annotations.AttributeValue;
import org.picketlink.idm.jpa.annotations.entity.IdentityManaged;
import org.picketlink.idm.model.basic.Role;

/**
 * @author pedroigor
 */
@IdentityManaged (Role.class)
@Entity
public class RoleTypeEntity extends IdentityTypeEntity {

    private static final long serialVersionUID = -1111674876657091722L;

    @AttributeValue
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
