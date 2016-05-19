package co.runcode.dm.idm;

import javax.persistence.Entity;
import org.picketlink.idm.credential.storage.EncodedPasswordStorage;
import org.picketlink.idm.jpa.annotations.CredentialProperty;
import org.picketlink.idm.jpa.annotations.entity.ManagedCredential;

/**
 * <p>This entity is mapped to support Password credential types using a {@link org.picketlink.idm.credential.storage.EncodedPasswordStorage}.</p>
 *
 * @author pedroigor
 */
@ManagedCredential (EncodedPasswordStorage.class)
@Entity
public class PasswordCredentialTypeEntity extends AbstractCredentialTypeEntity {

    private static final long serialVersionUID = -1073369096518010570L;

    @CredentialProperty (name = "encodedHash")
    private String passwordEncodedHash;

    @CredentialProperty (name = "salt")
    private String passwordSalt;

    public String getPasswordEncodedHash() {
        return passwordEncodedHash;
    }

    public void setPasswordEncodedHash(String passwordEncodedHash) {
        this.passwordEncodedHash = passwordEncodedHash;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

}
