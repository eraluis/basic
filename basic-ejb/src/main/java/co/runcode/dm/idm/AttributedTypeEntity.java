package co.runcode.dm.idm;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import org.picketlink.idm.jpa.annotations.Identifier;

/**
 * @author pedroigor
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AttributedTypeEntity implements Serializable {

    private static final long serialVersionUID = 4307228478304485446L;

    @Id
    @Identifier
    private String id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!getClass().isInstance(obj)) {
            return false;
        }

        AttributedTypeEntity other = (AttributedTypeEntity) obj;

        return getId() != null && other.getId() != null && getId().equals(other.getId());
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        return result;
    }

}
