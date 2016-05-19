package co.runcode.dm.idm;

import org.picketlink.idm.jpa.annotations.OwnerReference;
import org.picketlink.idm.jpa.annotations.RelationshipDescriptor;
import org.picketlink.idm.jpa.annotations.RelationshipMember;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * @author pedroigor
 */
@Entity
public class RelationshipIdentityTypeEntity implements Serializable {

    private static final long serialVersionUID = -3619372498444894118L;

    @Id
    @GeneratedValue
    private Long identifier;

    @RelationshipDescriptor
    private String descriptor;

    @RelationshipMember
    @ManyToOne
    private IdentityTypeEntity identityType;

    @OwnerReference
    @ManyToOne
    private RelationshipTypeEntity owner;

    public Long getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Long identifier) {
        this.identifier = identifier;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public IdentityTypeEntity getIdentityType() {
        return identityType;
    }

    public void setIdentityType(IdentityTypeEntity identityType) {
        this.identityType = identityType;
    }

    public RelationshipTypeEntity getOwner() {
        return owner;
    }

    public void setOwner(RelationshipTypeEntity owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!getClass().isInstance(obj)) {
            return false;
        }

        RelationshipIdentityTypeEntity other = (RelationshipIdentityTypeEntity) obj;

        return getIdentifier() != null && other.getIdentifier() != null && getIdentifier().equals(other.getIdentifier());
    }

    @Override
    public int hashCode() {
        int result = getIdentifier() != null ? getIdentifier().hashCode() : 0;
        result = 31 * result + (getIdentifier() != null ? getIdentifier().hashCode() : 0);
        return result;
    }
}
