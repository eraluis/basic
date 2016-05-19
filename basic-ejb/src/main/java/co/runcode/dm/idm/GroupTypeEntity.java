package co.runcode.dm.idm;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.picketlink.idm.jpa.annotations.AttributeValue;
import org.picketlink.idm.jpa.annotations.entity.IdentityManaged;
import org.picketlink.idm.model.basic.Group;

/**
 * @author pedroigor
 */
@IdentityManaged (Group.class)
@Entity
public class GroupTypeEntity extends IdentityTypeEntity {

    private static final long serialVersionUID = 158403858486164771L;

    @AttributeValue
    private String name;

    @AttributeValue
    private String path;

    @ManyToOne
    @AttributeValue (name = "parentGroup")
    private GroupTypeEntity parent;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public GroupTypeEntity getParent() {
        return parent;
    }

    public void setParent(GroupTypeEntity parent) {
        this.parent = parent;
    }
}
