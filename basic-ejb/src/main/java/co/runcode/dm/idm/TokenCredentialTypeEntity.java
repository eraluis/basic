package co.runcode.dm.idm;

import org.picketlink.idm.credential.storage.TokenCredentialStorage;
import org.picketlink.idm.jpa.annotations.CredentialProperty;
import org.picketlink.idm.jpa.annotations.entity.ManagedCredential;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * <p>{@link javax.persistence.Entity} representing a {@link org.picketlink.idm.credential.Token}.</p>
 *
 * @author Pedro Igor
 */
@ManagedCredential(TokenCredentialStorage.class)
@Entity
public class TokenCredentialTypeEntity extends AbstractCredentialTypeEntity {

    @CredentialProperty
    @Column
    private String type;

    @CredentialProperty
    @Column(columnDefinition = "TEXT")
    private String token;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
