package co.runcode.dm.idm;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.picketlink.idm.jpa.annotations.CredentialClass;
import org.picketlink.idm.jpa.annotations.EffectiveDate;
import org.picketlink.idm.jpa.annotations.ExpiryDate;
import org.picketlink.idm.jpa.annotations.OwnerReference;

/**
 * <p>Base mapping for credentials.</p>
 * @author pedroigor
 */
@MappedSuperclass
public abstract class AbstractCredentialTypeEntity implements Serializable {

    private static final long serialVersionUID = -8032908635337756851L;

    @Id
    @GeneratedValue
    private Long id;

    @OwnerReference
    @ManyToOne
    private AttributedTypeEntity owner;

    @CredentialClass
    private String typeName;

    @Temporal(TemporalType.TIMESTAMP)
    @EffectiveDate
    private Date effectiveDate;

    @Temporal(TemporalType.TIMESTAMP)
    @ExpiryDate
    private Date expiryDate;

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

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
