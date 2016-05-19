package co.runcode.dm.idm;

import javax.persistence.Entity;
import org.picketlink.idm.jpa.annotations.RelationshipClass;
import org.picketlink.idm.jpa.annotations.entity.IdentityManaged;
import org.picketlink.idm.model.Relationship;

/**
 * @author pedroigor
 */
@IdentityManaged (Relationship.class)
@Entity
public class RelationshipTypeEntity extends AttributedTypeEntity {

    private static final long serialVersionUID = -3619372498444894118L;

    @RelationshipClass
    private String typeName;

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
