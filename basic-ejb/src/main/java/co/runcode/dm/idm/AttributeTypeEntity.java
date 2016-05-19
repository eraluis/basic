package co.runcode.dm.idm;

import org.picketlink.idm.jpa.annotations.AttributeClass;
import org.picketlink.idm.jpa.annotations.AttributeName;
import org.picketlink.idm.jpa.annotations.AttributeValue;
import org.picketlink.idm.jpa.annotations.OwnerReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * @author pedroigor
 */
@Entity
public class AttributeTypeEntity implements Serializable {

    private static final long serialVersionUID = 5255050503622214581L;

    @Id
    @GeneratedValue
    private Long id;

    @OwnerReference
    @ManyToOne
    private AttributedTypeEntity owner;

    @AttributeClass
    private String typeName;

    @AttributeName
    private String name;

    @AttributeValue
    @Column(length = 1024) private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AttributedTypeEntity getOwner() {
        return owner;
    }

    public void setOwner(AttributedTypeEntity owner) {
        this.owner = owner;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!getClass().isInstance(obj)) {
            return false;
        }

        AttributeTypeEntity other = (AttributeTypeEntity) obj;

        return getId() != null && other.getId() != null && getId().equals(other.getId());
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        return result;
    }

}
